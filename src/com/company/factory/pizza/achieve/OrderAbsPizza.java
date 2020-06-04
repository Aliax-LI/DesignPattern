package com.company.factory.pizza.achieve;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.factory.AbsFactory;
import com.company.factory.pizza.utils.IOUtils;


/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-31 00:10
 **/
public class OrderAbsPizza {

    AbsFactory absFactory;

    public OrderAbsPizza(AbsFactory factory) {
        setAbsFactory(factory);
    }

    private void setAbsFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = factory;
        do {
            orderType = IOUtils.getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }


}
