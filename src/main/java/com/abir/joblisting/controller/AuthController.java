package com.abir.joblisting.controller;

import com.abir.joblisting.model.JWTRequest;
import com.abir.joblisting.model.JWTResponse;
import com.abir.joblisting.security.JwtHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private JwtHelper helper;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    @PostMapping("/login")
    public ResponseEntity<JWTResponse> login(@RequestBody JWTRequest request) {
        this.doAuthenticate(request.getUsername(), request.getPassword());
        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());


        String token = this.helper.generateToken(userDetails);

        System.out.println(userDetails.toString());

        List<String> authorities = userDetails.getAuthorities().stream()
                .map(Object::toString)
                .collect(Collectors.toList());

        JWTResponse response = new JWTResponse();
        response.setToken(token);
        response.setUsername(userDetails.getUsername());
        response.setAuthorities(authorities.get(0));

        /*
        Required type: String
        Provided: List
        <java.lang.String>*/

        System.out.println(authorities.get(0));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private void doAuthenticate(String username, String password) {
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(username, password);

        try {
            manager.authenticate(authentication);
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Invalid username or Password");
        }
    }
}
