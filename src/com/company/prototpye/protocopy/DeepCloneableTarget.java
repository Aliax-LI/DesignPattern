package com.company.prototpye.protocopy;

import java.io.Serializable;

/**
 * @program: DesignPattern
 * @description: 深拷贝
 * @author: Mr.Li
 * @create: 2020-06-01 23:23
 **/
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
}
