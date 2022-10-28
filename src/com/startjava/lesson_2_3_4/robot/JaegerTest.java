package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Romeo Blue", "USA", 255, 7775, 2, 6);
        Jaeger jaeger2 = new Jaeger();

        jaeger2.setModelName("Horizon Brave");
        jaeger2.setOrigin("China");
        jaeger2.setHeight(238);
        jaeger2.setWeight(7890);
        jaeger2.setSpeed(8);
        jaeger2.setArmor(6);

        jaeger1.sit();
        jaeger2.run();

        System.out.println("\nИмя модели: " + jaeger1.getModelName());
        System.out.println("Вес: " + jaeger1.getWeight());
        System.out.println("Скорость: " + jaeger1.getSpeed());

        System.out.println("\nИмя модели: " + jaeger2.getModelName());
        System.out.println("Вес: " + jaeger2.getWeight());
        System.out.println("Скорость: " + jaeger2.getSpeed());

        jaeger1.setSpeed(jaeger2.getSpeed());
        jaeger2.setWeight(jaeger1.getWeight());

        System.out.println("\nИмя модели: " + jaeger1.getModelName());
        System.out.println("Вес: " + jaeger1.getWeight());
        System.out.println("Скорость: " + jaeger1.getSpeed());

        System.out.println("\nИмя модели: " + jaeger2.getModelName());
        System.out.println("Вес: " + jaeger2.getWeight());
        System.out.println("Скорость: " + jaeger2.getSpeed());
    }
}