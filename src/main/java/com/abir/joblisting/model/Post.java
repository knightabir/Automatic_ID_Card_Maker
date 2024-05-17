package com.abir.joblisting.model;

import org.bson.codecs.ObjectIdCodec;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.UUID;

@Document
public class Post {

    @Id
    private ObjectId _id;
    private String profile;
    private String desc;
    private String exp;
    private String techs[];

    public Post() {
    }

    public Post(ObjectId _id, String profile, String desc, String exp, String[] techs) {
        this._id = _id;
        this.profile = profile;
        this.desc = desc;
        this.exp = exp;
        this.techs = techs;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "_id=" + _id +
                ", profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp='" + exp + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
