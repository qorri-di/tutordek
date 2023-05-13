package com.qodev.domain;

import javax.persistence.*;

@Entity
@Table(name = "vw_listemployee",schema = "training")
public class VwListemployee {
    @Id
    @Column(name = "emp_id")
    private Long empId;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthdate")
    private java.sql.Date birthdate;

    @Column(name = "position_code")
    private String positionCode;

    @Column(name = "level_code")
    private String levelCode;

    @Column(name = "division_code")
    private String divisionCode;

    public Long getEmpId() {
        return this.empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public java.sql.Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(java.sql.Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPositionCode() {
        return this.positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getLevelCode() {
        return this.levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }
}
