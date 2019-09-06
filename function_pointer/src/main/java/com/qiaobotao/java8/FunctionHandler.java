package com.qiaobotao.java8;

import java.rmi.Remote;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 方法管理类
 * @create 2019-09-06 16:42
 **/
public class FunctionHandler {

    /**
     *  远程调用方法
     */
    public void remote(){
        RemoteFunc proxy = new RemoteFunc();
        proxy.service(this::callback);
    }

    /**
     * 回调方法
     * @param a
     * @param b
     */
    public void callback(String a,String b){
        System.out.println(a+"   "+ b);
    }

}
