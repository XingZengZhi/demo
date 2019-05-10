package com.shop.store.Thread;

/**
 * 类名:
 * 概要: play thread
 *
 * @author xzz
 * @version 1.00 (2019年05月09日)
 */
public class NewThread implements Runnable{
    Thread t;

    public NewThread() {
        this.t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0;i < 5;i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
