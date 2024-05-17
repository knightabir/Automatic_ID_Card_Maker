package com.abir.joblisting.service.impl;

import com.abir.joblisting.model.role.Role;
import com.abir.joblisting.repository.RoleRepository;
import com.abir.joblisting.repository.UserRepository;
import com.abir.joblisting.service.RoleService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    public RoleRepository roleRepository;



    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(ObjectId id) {
        return roleRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Role not found."));
    }

    @Override
    public Role saveRole(Role role) {
        //validation
        if (role.getName() == null || Objects.equals(role.getName(), "")){
            throw new IllegalArgumentException("Please provide role.");
        }else {
         return roleRepository.save(role);
        }
    }

    @Override
    public Role updateRole(ObjectId id, Role role) {
        Role existingRole = getRoleById(id);

        existingRole.setId(id);
        existingRole.setName(role.getName());

        return roleRepository.save(existingRole);
    }

    @Override
    public void deleteById(ObjectId id) {
        Role existingRole = getRoleById(id);
        roleRepository.delete(existingRole);
    }
}
