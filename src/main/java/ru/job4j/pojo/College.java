package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setData("01.08.2017");
        student.setFullName("Бойко Виктор Петрович");
        student.setGroup("ПКС17");
        System.out.println("Студен " + student.getFullName() + " зачислен на курс " + student.getGroup()
                + " " + student.getData());
    }

}