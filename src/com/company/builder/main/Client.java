package com.company.builder.main;

import com.company.builder.absbuilder.concrete.CommonHouse;
import com.company.builder.absbuilder.concrete.HighHouse;
import com.company.builder.director.HouseDirector;
import com.company.builder.product.House;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-02 00:10
 **/
public class Client {
    public static void main(String[] args) {
        // 普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house);

        HighHouse highHouse = new HighHouse();
        houseDirector.setAbstractHouse(highHouse);
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);
    }
}
