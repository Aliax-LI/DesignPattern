package com.company.builder.absbuilder.concrete;

import com.company.builder.absbuilder.AbstractHouse;

/**
 * @program: DesignPattern
 * @description: 具体建造者
 * @author: Mr.Li
 * @create: 2020-06-02 00:09
 **/
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子房顶");
    }
}
