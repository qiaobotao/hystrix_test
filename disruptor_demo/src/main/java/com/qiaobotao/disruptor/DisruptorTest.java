package com.qiaobotao.disruptor;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;


/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述
 * @create 2019-07-23 21:21
 **/
public class DisruptorTest {

    public static void main(String[] args) {
        String message = "Hello Disruptor!";
        //必须是2的N次方
        int ringBufferSize = 1024;
        Disruptor<MessageEvent> disruptor = new Disruptor<MessageEvent>(new MessageEventFactory(),ringBufferSize,new MessageThreadFactory(),ProducerType.SINGLE,new BlockingWaitStrategy());
        disruptor.handleEventsWith(new MessageEventHandler());
        disruptor.setDefaultExceptionHandler(new MessageExceptionHandler());
        RingBuffer<MessageEvent> ringBuffer = disruptor.start();
        MessageEventProducer producer = new MessageEventProducer(ringBuffer);
        producer.onData(message);
    }

}
