package com.company.factory.pizza.achieve;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.utils.IOUtils;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-30 23:41
 **/
public abstract class AbOrderPizza {

    Pizza pizza = null;
    String orderType = null;

    protected abstract Pizza createPizza(String orderType);
    public AbOrderPizza() {
        start();
    }

    private void start() {
        do {
            orderType = IOUtils.getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
        } while (true);
    }


}
