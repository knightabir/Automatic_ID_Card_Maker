package com.abir.joblisting.model.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Document(collection = "Role")
public class Role implements GrantedAuthority{
    @Id
    private ObjectId _id;

    @Indexed(unique = true)
    private String name;

    public Role() {
    }

    public Role(ObjectId id, String name) {
        this._id = id;
        this.name = name;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    @JsonIgnore
    public String getAuthority() {
        return this.name;
    }
}
