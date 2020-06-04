package com.company.prototpye.main;

import com.company.prototpye.Sheep;
import com.company.prototpye.protocopy.DeepCloneableTarget;
import com.company.prototpye.protocopy.DeepProtoType;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-01 22:38
 **/
public class Client {

    public static void main(String[] args) throws Exception{
        Sheep sheep = new Sheep("tom", 1, "RED");
        sheep.friend = new Sheep("jack", 1, "BACLK");
        // 克隆
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();

        System.out.println(sheep1 + "--->" + sheep1.friend.hashCode());
        System.out.println(sheep2 + "--->" + sheep2.friend.hashCode());

        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "调度";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("A", "B");

        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType1 + "--->" +deepProtoType1.deepCloneableTarget.hashCode());
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType2 + "--->" +deepProtoType2.deepCloneableTarget.hashCode());
    }
}
