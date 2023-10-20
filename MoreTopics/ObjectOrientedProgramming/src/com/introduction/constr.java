package com.introduction;

public class constr {
    public static void main(String[] args) {
        Student maulik = new Student(5814, "SmartBoy", 78.54f);
        System.out.println(maulik.rno);
        System.out.println(maulik.name);
        System.out.println(maulik.marks);
    }
    static class Student {
        int rno;
        String name;
        float marks;
        Student(int rnum, String naam, float marks) {
            this.rno = rnum;
            this.name = naam;
            this.marks = marks;
        }
    }
}
