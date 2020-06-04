package com.company.factory.pizza.expand;

import com.company.factory.pizza.base.Pizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-30 23:37
 **/
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作伦敦奶酪披萨准备原材料");
    }
}
