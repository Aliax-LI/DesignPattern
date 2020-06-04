package com.company.factory.pizza.factory;

import com.company.factory.pizza.base.Pizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-31 00:05
 **/
public interface AbsFactory {

    public Pizza createPizza(String orderType);
}
