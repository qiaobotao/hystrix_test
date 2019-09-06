package com.qiaobotao.reflect;

import java.lang.reflect.Method;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 数据处理方法
 * @create 2019-09-06 15:51
 **/
public class DataProcess {

    /**
     * 方法1
     * @param data
     * @return
     */
    public static String method1(String data) {
        System.out.println("调用method1-->"+data);
        return "method1--->"+data;
    }

    /**
     * 方法2
     * @param data
     * @return
     */
    public static String method2(String data) {
        System.out.println("调用method2-->"+data);
        return "method2--->"+data;
    }

    /**
     * 方法调用类
     * @param method
     * @param data
     * @return
     * @throws Exception
     */
    public static String callFun(Method method, String data) throws Exception {
        try {
            return (String) method.invoke(null, data);
        } catch (Exception exp) {
            throw exp;
        }
    }
}
