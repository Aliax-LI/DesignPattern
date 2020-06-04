package com.company.factory.pizza.expand;

import com.company.factory.pizza.base.Pizza;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-30 22:45
 **/
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作希腊披萨准备原材料");
    }
}
