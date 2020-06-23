package main;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("张三", 20, '男', "12345678910");
        System.out.println("姓名：" + student.getName());
        System.out.println("年龄：" + student.getAge());
        System.out.println("性别：" + student.getGender());
        System.out.println("身份证号：" + student.getId());
    }
}
