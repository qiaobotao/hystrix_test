package com.qiaobotao.disruptor;

import com.lmax.disruptor.EventHandler;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 消息处理
 * @create 2019-07-23 21:39
 **/
public class MessageEventHandler implements EventHandler<MessageEvent> {

    @Override
    public void onEvent(MessageEvent messageEvent, long l, boolean b) throws Exception {
        System.out.println(messageEvent.getMessage());
    }

}
