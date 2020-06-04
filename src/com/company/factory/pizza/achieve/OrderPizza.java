package com.company.factory.pizza.achieve;

import com.company.factory.pizza.base.Pizza;
import com.company.factory.pizza.factory.SimpleFactory;
import com.company.factory.pizza.utils.IOUtils;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-30 22:55
 **/
public class OrderPizza {
    // 定义一个工厂对象实现
    Pizza pizza = null;
    String orderType = "";


    public OrderPizza() {
        start();
    }
    // 设置简单工厂对象

    private void start() {
        do {
            orderType = IOUtils.getType();
            pizza = SimpleFactory.createPizza(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();;
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }



}
