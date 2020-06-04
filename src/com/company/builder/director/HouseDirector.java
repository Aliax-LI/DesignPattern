package com.company.builder.director;

import com.company.builder.absbuilder.AbstractHouse;
import com.company.builder.product.House;

/**
 * @program: DesignPattern
 * @description: 指挥者
 * @author: Mr.Li
 * @create: 2020-06-02 00:36
 **/
public class HouseDirector {
    AbstractHouse abstractHouse = null;
    // 构造器传入abstractHouse
    public HouseDirector(AbstractHouse abstractHouse) {
        this.abstractHouse = abstractHouse;
    }
    // 通过setter 传入abstractHouse
    public void setAbstractHouse(AbstractHouse abstractHouse) {
        this.abstractHouse = abstractHouse;
    }
    // 处理建造房子流程
    public House constructHouse() {
        abstractHouse.buildBasic();
        abstractHouse.buildWalls();
        abstractHouse.roofed();
        return abstractHouse.buildHouse();
    }
}
