package com.startjava.lesson_2_3_4.person;
public class Person {
    
    String sex = "male";
    String name = "Konstantin";
    int height = 182;
    int weight = 75;
    int age = 26;

    public void move() {
        System.out.println("Идти");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежать");
    }

    public void say() {
        System.out.println("Говорить");
    }

    public void learnJava() {
        System.out.println("Учить java");
    }
}