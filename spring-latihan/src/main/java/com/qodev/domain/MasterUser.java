package com.qodev.domain;

import javax.persistence.*;

@Entity
@Table(name = "mst_user", schema = "public")
public class MasterUser {
    @Id
    @SequenceGenerator(name = "mst_user_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mst_user_seq")
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_posisi")
    private ResourceType userPosisi;

    @Column(name = "user_mail", unique = true, nullable = false)
    private String userMail;

    @Column(name = "user_pass", nullable = false)
    private String userPwd;

    @Column(name = "user_phone", nullable = false)
    private String userPhone;

    @Column(name = "user_address", nullable = false)
    private String userAddr;

    public enum ResourceType {
        Admin, SuperAdmin
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ResourceType getUserPosisi() {
        return userPosisi;
    }

    public void setUserPosisi(ResourceType userPosisi) {
        this.userPosisi = userPosisi;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }
}