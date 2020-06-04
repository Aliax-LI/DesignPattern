package com.company.factory.pizza.achieve.order;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.achieve.AbOrderPizza;
import com.company.factory.pizza.expand.BJCheesePizza;
import com.company.factory.pizza.expand.BJPepperPizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-30 23:48
 **/
public class BJOrderPizza extends AbOrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
