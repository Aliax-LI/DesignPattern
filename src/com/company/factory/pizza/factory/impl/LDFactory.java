package com.company.factory.pizza.factory.impl;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.expand.LDCheesePizza;
import com.company.factory.pizza.expand.LDPepperPizza;
import com.company.factory.pizza.factory.AbsFactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-31 00:07
 **/
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
