package com.hoanganh.model;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private Long id;
    private String userName;
    private String password;
    private String fullName;
    private String address;
    private String gender;
    private int age;

    private int svNam;

    private int thamNien;

    private String userCode;
    private StudentModel studentModel;
    private TeacherModel teacherModel;
    private RoleModel roleModel;

    private String type;

    private List<UserModel> listUser = new ArrayList<>();
    private List<StudentModel> listStudent = new ArrayList<>();
    private List<TeacherModel> listTeacher = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<UserModel> getListUser() {
        return listUser;
    }

    public int getSvNam() {
        return svNam;
    }

    public void setSvNam(int svNam) {
        this.svNam = svNam;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public void setListUser(List<UserModel> listUser) {
        this.listUser = listUser;
    }

    public List<StudentModel> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<StudentModel> listStudent) {
        this.listStudent = listStudent;
    }

    public List<TeacherModel> getListTeacher() {
        return listTeacher;
    }

    public void setListTeacher(List<TeacherModel> listTeacher) {
        this.listTeacher = listTeacher;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public StudentModel getStudentModel() {
        return studentModel;
    }

    public void setStudentModel(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    public TeacherModel getTeacherModel() {
        return teacherModel;
    }

    public void setTeacherModel(TeacherModel teacherModel) {
        this.teacherModel = teacherModel;
    }

    public RoleModel getRoleModel() {
        return roleModel;
    }

    public void setRoleModel(RoleModel roleModel) {
        this.roleModel = roleModel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
