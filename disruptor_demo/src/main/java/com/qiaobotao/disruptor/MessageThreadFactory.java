package com.qiaobotao.disruptor;

import java.util.concurrent.ThreadFactory;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 消费者线程工厂
 * @create 2019-07-23 21:38
 **/
public class MessageThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,"Simple Disruptor Test Thread");
    }
}
