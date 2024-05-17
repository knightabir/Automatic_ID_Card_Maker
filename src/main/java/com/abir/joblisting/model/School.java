package com.abir.joblisting.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "schools")
public class School{

    @Id
    private ObjectId _id;

    @Indexed(unique = true)
    private String schoolName;
    private String schoolAddress;
    private String hoi;

    @DBRef
    private User user;

    public School() {

    }

    public School(ObjectId _id, String schoolName, String schoolAddress, String hoi, User user) {
        this._id = _id;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.hoi = hoi;
        this.user = user;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getHoi() {
        return hoi;
    }

    public void setHoi(String hoi) {
        this.hoi = hoi;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + _id +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", hoi='" + hoi + '\'' +
                '}';
    }
}
