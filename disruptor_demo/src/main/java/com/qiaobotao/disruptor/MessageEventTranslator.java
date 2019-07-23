package com.qiaobotao.disruptor;

import com.lmax.disruptor.EventTranslatorOneArg;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 消息转换
 * @create 2019-07-23 21:37
 **/
public class MessageEventTranslator implements EventTranslatorOneArg<MessageEvent,String> {

    @Override
    public void translateTo(MessageEvent messageEvent, long l, String s) {
        messageEvent.setMessage(s);
    }
}
