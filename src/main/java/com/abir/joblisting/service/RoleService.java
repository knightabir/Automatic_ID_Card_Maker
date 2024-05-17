package com.abir.joblisting.service;

import com.abir.joblisting.model.role.Role;
import org.bson.types.ObjectId;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRoles();
    public Role getRoleById(ObjectId id);
    public Role saveRole(Role role);
    public Role updateRole(ObjectId id, Role role);
    public void deleteById(ObjectId id);
}
