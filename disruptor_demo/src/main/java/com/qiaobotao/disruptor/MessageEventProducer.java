package com.qiaobotao.disruptor;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 消息生产
 * @create 2019-07-23 21:42
 **/
public class MessageEventProducer {

    private RingBuffer<MessageEvent> ringBuffer;

    public MessageEventProducer(RingBuffer<MessageEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    /**
     * 将接收到的消息输出到ringBuffer
     * @param message
     */
    public void onData(String message){
        EventTranslatorOneArg<MessageEvent,String> translator = new MessageEventTranslator();
        ringBuffer.publishEvent(translator,message);
    }

}
