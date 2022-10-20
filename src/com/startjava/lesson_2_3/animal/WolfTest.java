package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("Мужской");
        wolf.setName("Фенрир");
        wolf.setWeight(60);
        wolf.setAge(6);
        wolf.setColor("Черный");

        System.out.print("Пол: " + wolf.getSex() + "; кличка: " + wolf.getName());
        System.out.print("; вес: " + wolf.getWeight() + "; возраст: " + wolf.getAge());
        System.out.print("; окрас: " + wolf.getColor() + "\n");

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}