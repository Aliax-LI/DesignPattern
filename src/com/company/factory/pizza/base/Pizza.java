package com.company.factory.pizza.base;

/**
 * @program: DesignPattern
 * @description:扩展
 * @author: Mr.Li
 * @create: 2020-05-30 22:41
 **/
public abstract class Pizza {
    protected String name;
    // 准备原材料，不同的披萨不一样
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public void cut() {
        System.out.println(name + " cutting");
    }

    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
