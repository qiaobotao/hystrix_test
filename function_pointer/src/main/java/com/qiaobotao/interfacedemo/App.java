package com.qiaobotao.interfacedemo;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 执行方法
 * @create 2019-09-06 16:19
 **/
public class App {

    /**
     * 方法调用类
     * @param data
     * @param dataProcess
     * @return
     */
    public static String dataHandler(String data, DataProcess dataProcess) {
        return dataProcess.exce(data);
    }

    /**
     * 调用主方法
     * @param args
     */
    public static void main(String[] args) {
        String data = "需要处理的数据";
        dataHandler(data, new DataProcess1());
        dataHandler(data, new DataProcess2());
    }

}
