package com.company.factory.pizza.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: DesignPattern
 * @description:
 * @author: Mr.Li
 * @create: 2020-05-31 00:14
 **/
public class IOUtils {
    public static String getType() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type: ");
        String str = null;
        try {
            str = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
