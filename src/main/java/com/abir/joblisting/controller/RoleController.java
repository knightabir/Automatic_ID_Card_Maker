package com.abir.joblisting.controller;

import com.abir.joblisting.model.role.Role;
import com.abir.joblisting.service.RoleService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @GetMapping()
    public List<Role> roles(){
        return roleService.getAllRoles();
    }

    @PostMapping()
    public Role saveRole(@RequestBody Role role){
        return roleService.saveRole(role);
    }

    @GetMapping("/{id}")
    public Role getRoleById(@RequestParam ObjectId id){
        return roleService.getRoleById(id);
    }

    @PutMapping("/{id}")
    public Role updateRoleById(@RequestParam ObjectId id, @RequestBody Role role){
        return roleService.updateRole(id,role);
    }

    @DeleteMapping("/{id}")
    public String deleteRoleById(@RequestParam ObjectId id){
        String response = null;
        try {
            roleService.deleteById(id);
            response = "Role Deleted Successfully.";
        }catch (Exception e){
            response =e.getMessage();
        }
        return response;
    }


}
