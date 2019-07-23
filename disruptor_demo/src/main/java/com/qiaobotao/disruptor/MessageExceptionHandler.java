package com.qiaobotao.disruptor;

import com.lmax.disruptor.ExceptionHandler;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 异常处理
 * @create 2019-07-23 21:39
 **/
public class MessageExceptionHandler implements ExceptionHandler<MessageEvent> {

    @Override
    public void handleEventException(Throwable ex, long sequence, MessageEvent event) {
        ex.printStackTrace();
    }

    @Override
    public void handleOnStartException(Throwable ex) {
        ex.printStackTrace();

    }

    @Override
    public void handleOnShutdownException(Throwable ex) {
        ex.printStackTrace();

    }

}
