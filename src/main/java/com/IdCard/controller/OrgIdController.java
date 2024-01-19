package com.IdCard.controller;

import com.IdCard.entity.OrgId;
import com.IdCard.service.OrgIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/orgid")
public class OrgIdController {

    @Autowired
    private OrgIdService orgIdService;

    @PostMapping("/")
    public OrgId creteOrgId(@RequestBody OrgId orgId) throws Exception{
        return this.orgIdService.addId(orgId);
    }

    @GetMapping("/{userId}")
    public  OrgId getUserById(@PathVariable("userid") Long userid){
        return this.orgIdService.getOrgIdById(userid);
    }

    @PutMapping("/{userId}")
    public OrgId updateUserById(@PathVariable("userId") Long userId, @RequestBody OrgId orgId) throws Exception{
        return this.orgIdService.updateId(orgId,userId);
    }

    @GetMapping("/all")
    public List<OrgId> getALlOrgUser(){
        return this.orgIdService.getOrgId();
    }

    @DeleteMapping("/{userId}")
    public void deleteById(@PathVariable Long userId){
        this.orgIdService.deleteOrgIdById(userId);
    }

    @GetMapping("/orgid/{orgId}")
    public List<OrgId> getIdOfOrg (@PathVariable Long orgId){
        return orgIdService.getListOfId(orgId);
    }

}
