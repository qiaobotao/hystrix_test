package com.qiaobotao;

/**
 * Hello world!
 *
 */
public class Test {

    public static volatile long temp2 = 0;

    public static void main( String[] args ) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        for(long i=0;i<500000000L;i++) {
            //autoIncr();
            //autoIncr2();
            autoIncr3();
        }
        System.out.println(System.currentTimeMillis() - time);
    }

    public synchronized static void autoIncr(){
        long temp = 0L;
        temp = temp + 1;
    }

    public static void autoIncr2() {
        long temp = 0L;
        temp = temp + 1;
    }

    public static void autoIncr3() {
        temp2 = temp2 + 1;
    }
}
