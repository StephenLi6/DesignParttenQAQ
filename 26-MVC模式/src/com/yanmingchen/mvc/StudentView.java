package com.yanmingchen.mvc;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:41 2018/6/15
 * @Description:学生视图类
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}
