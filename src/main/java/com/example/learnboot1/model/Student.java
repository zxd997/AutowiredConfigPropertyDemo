package com.example.learnboot1.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer sid;

    private String sname;

    private String sage;

    private Integer uid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage == null ? null : sage.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}