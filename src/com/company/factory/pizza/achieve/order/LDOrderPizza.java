package com.company.factory.pizza.achieve.order;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.achieve.AbOrderPizza;
import com.company.factory.pizza.expand.LDCheesePizza;
import com.company.factory.pizza.expand.LDPepperPizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-30 23:50
 **/
public class LDOrderPizza extends AbOrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
