package com.qiaobotao.java8;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 调用类
 * @create 2019-09-06 16:43
 **/
public class RemoteFunc {

    public void service(Function<String,String> str){
        str.apply("hello", "world...");
    }

}
