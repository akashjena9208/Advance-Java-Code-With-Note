package com.jsp.hibernate;

import javax.persistence.Entity;

@Entity
public class Student {

    private int  studentId;
    private String studentName;
    private int studenAge;

    public int getStudenAge() {
        return studenAge;
    }

    public void setStudenAge(int studenAge) {
        this.studenAge = studenAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
