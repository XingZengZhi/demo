package com.shop.store.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 类名:
 * 概要: 服务器数据编码类
 *
 * @author xzz
 * @version 1.00 (2019年05月08日)
 */
public class TimeEncoderPOJO extends MessageToByteEncoder<Time> {
    // 发送数据时调用
    @Override
    protected void encode(ChannelHandlerContext ctx, Time time, ByteBuf out) throws Exception {
        // 只传输当前时间，精确到秒
        out.writeInt((int) time.value());
    }
}
