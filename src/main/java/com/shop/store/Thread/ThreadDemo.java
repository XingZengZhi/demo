package com.shop.store.Thread;

/**
 * 类名:
 * 概要: 玩玩线程
 *
 * @author xzz
 * @version 1.00 (2019年05月09日)
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // new NewThread();
        // try {
        //     for (int i = 5;i > 0;i--) {
        //         System.out.println("main thread: " + i);
        //         Thread.sleep(100);
        //     }
        // } catch (InterruptedException e) {
        //     System.out.println("Main thread interrupted.");
        // }
        // System.out.println("Main thread exiting.");
        ComputerMax computerMax = (x, y)->{
            return Math.max(x, y);
        };
        System.out.println("最大值是：" + computerMax.computerMax(1, 2));

        engine((x, y)-> x + y, 1, 2);
        engine((x, y)-> x * y, 2, 2);
        engine((x, y)-> x / y, 3, 2);
        engine((x, y)-> x % y, 5, 2);
    }

    private static void engine(ComputerMax computerMax, int x, int y){
        int result = computerMax.computerMax(x, y);
        System.out.println("计算结果：" + result);
    }
}
