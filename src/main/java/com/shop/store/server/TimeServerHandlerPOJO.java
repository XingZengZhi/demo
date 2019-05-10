package com.shop.store.server;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 类名:
 * 概要: 服务器解码器
 * 连接建立时发送当前时间
 *
 * @author xzz
 * @version 1.00 (2019年05月08日)
 */
public class TimeServerHandlerPOJO extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // 发送当前时间信息
        ChannelFuture f = ctx.writeAndFlush(new Time());
        // 发送完毕后关闭Channel
        f.addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
