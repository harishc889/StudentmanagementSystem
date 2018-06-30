package com.example.harish.studentmanagementsystem;

public class Student {
    String collegeName,userName,address;
    int phoneno;
    public Student(String userName,String address,int phoneno,String collegeName)
    {
        this.userName=userName;
        this.address=address;
        this.phoneno=phoneno;
        this.collegeName=collegeName;
    }
}
