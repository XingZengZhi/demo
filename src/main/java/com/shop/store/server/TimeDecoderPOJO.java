package com.shop.store.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * 类名:
 * 概要: 自定义客户端数据解码类
 *
 * @author xzz
 * @version 1.00 (2019年05月08日)
 * ByteToMessageDecoder 解码字节到消息
 * MessageToMessageDecoder<Integer> 将整型解码为字符串
 * ReplayingDecoder<Void> 无需检查缓冲区是否有足够的字节
 */
public class TimeDecoderPOJO extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> list) throws Exception {
        if (in.readableBytes() < 4) {
            return;
        }
        list.add(new Time(in.readUnsignedInt()));
    }
}
