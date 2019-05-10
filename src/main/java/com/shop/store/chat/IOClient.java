package com.shop.store.chat;

import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年05月09日)
 */
public class IOClient {
    public static void main(String[] args) {
        new Thread(()->{
            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + "hello world").getBytes());
                        socket.getOutputStream().flush();
                        Thread.sleep(2000);
                    } catch (Exception e){}
                }
            } catch (Exception e) {

            }
        }).start();
    }

}
