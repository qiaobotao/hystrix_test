package com.qiaobotao.reflect;

import java.lang.reflect.Method;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述
 * @create 2019-09-06 15:58
 **/
public class App {

    public static void main(String[] args) {
        try {
            // 通过反射获取到DataProcess类中的方法对象
            Method method1 = DataProcess.class.getMethod("method1", String.class);
            Method method2 = DataProcess.class.getMethod("method2", String.class);

            // 分别使用不同的方式处理数据
            DataProcess.callFun(method1, "数据1");
            DataProcess.callFun(method2, "数据2");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
