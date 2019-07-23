package com.qiaobotao.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 消息工厂
 * @create 2019-07-23 21:37
 **/
public class MessageEventFactory implements EventFactory<MessageEvent> {
    @Override
    public MessageEvent newInstance() {
        return new MessageEvent();
    }
}
