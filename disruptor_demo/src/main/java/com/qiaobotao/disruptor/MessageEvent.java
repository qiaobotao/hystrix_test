package com.qiaobotao.disruptor;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 消息事件
 * @create 2019-07-23 21:36
 **/
public class MessageEvent {
    /**
     * 原始消息
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
