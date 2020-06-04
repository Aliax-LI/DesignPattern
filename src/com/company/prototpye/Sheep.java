package com.company.prototpye;

/**
 * @program: DesignPattern
 * @description: 克隆羊问题
 * @author: Mr.Li
 * @create: 2020-06-01 22:18
 **/
public class Sheep implements Cloneable{

    private String name;
    private int age;
    private String color;
    // 对象如何处理
    public Sheep friend;

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 克隆该实例，使用默认clone方法
    @Override
    public Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }

}
