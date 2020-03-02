package com.spring.entity;

public class User {
    private String yhid;
    private String username;
    private String password;
    private String yhname;
    private String yhphone;

    public User(){  }

    public User(String yhid, String username, String password, String yhname, String yhphone) {
        this.yhid = yhid;
        this.username = username;
        this.password = password;
        this.yhname = yhname;
        this.yhphone = yhphone;
    }

    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYhname() {
        return yhname;
    }

    public void setYhname(String yhname) {
        this.yhname = yhname;
    }

    public String getYhphone() {
        return yhphone;
    }

    public void setYhphone(String yhphone) {
        this.yhphone = yhphone;
    }
}
