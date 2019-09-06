package com.qiaobotao.java8;

/**
 * @author 乔伯涛  qiaobotao@jd.com
 * @描述 函数接口
 * @create 2019-09-06 16:38
 **/
@FunctionalInterface
public interface Function<T,E> {
    public void apply(T t,E e);
}
