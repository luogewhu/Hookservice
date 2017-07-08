package com.leonnewton.databaseopre;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "MSG".
 */
@Entity
public class Msg {

    @Id
    private Long id;
    private String packageName;
    private String functionName;
    private String pid;
    private String uid;
    private String time;

    @Generated
    public Msg() {
    }

    public Msg(Long id) {
        this.id = id;
    }

    @Generated
    public Msg(Long id, String packageName, String functionName, String pid, String uid, String time) {
        this.id = id;
        this.packageName = packageName;
        this.functionName = functionName;
        this.pid = pid;
        this.uid = uid;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
