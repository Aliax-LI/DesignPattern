package com.company.prototpye.protocopy;

import java.io.*;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-01 23:28
 **/
public class DeepProtoType implements Serializable, Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType() {
        super();
    }

    // 实现深拷贝，方式一
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型和String的克隆
        deep = super.clone();
        // 对引用数据类型，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    // 实现深拷贝，方式二
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象以对象流的方式输出
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
