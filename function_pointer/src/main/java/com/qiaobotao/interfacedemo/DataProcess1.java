package com.qiaobotao.interfacedemo;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 处理方法1
 * @create 2019-09-06 16:16
 **/
public class DataProcess1 implements DataProcess{

    @Override
    public String exce(String data) {
        System.out.println("处理方法1--->"+data);
        return data;
    }
}
