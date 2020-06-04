package com.company.builder.absbuilder;

import com.company.builder.product.House;

/**
 * @program: DesignPattern
 * @description: 抽象建造者
 * @author: Mr.Li
 * @create: 2020-06-01 23:59
 **/
public abstract class AbstractHouse {
    protected House house = new House();
    // 打地基
    public abstract void buildBasic();
    // 砌墙
    public abstract void buildWalls();
    // 房顶
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
