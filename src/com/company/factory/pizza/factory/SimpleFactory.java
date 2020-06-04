package com.company.factory.pizza.factory;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.expand.CheesePizza;
import com.company.factory.pizza.expand.GreekPizza;
import com.company.factory.pizza.expand.PepperPizza;

/**
 * @program: DesignPattern
 * @description: 简单工厂类
 * @author: Mr.Li
 * @create: 2020-05-30 22:49
 **/
public class SimpleFactory {
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
