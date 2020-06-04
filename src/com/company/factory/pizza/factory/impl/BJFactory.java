package com.company.factory.pizza.factory.impl;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.expand.BJCheesePizza;
import com.company.factory.pizza.expand.BJPepperPizza;
import com.company.factory.pizza.factory.AbsFactory;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-31 00:07
 **/
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
