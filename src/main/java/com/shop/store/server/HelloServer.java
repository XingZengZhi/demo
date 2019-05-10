package com.shop.store.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * 类名:
 * 概要:
 *
 * @author xzz
 * @version 1.00 (2019年05月08日)
 */
public class HelloServer {
    private int port;

    public HelloServer(int port) {
        this.port = port;
    }

    public void run() throws Exception{
        // 接收进来的连接
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // 处理已经被接收的连接
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        System.out.println("准备运行端口" + port);

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class) //告诉Channel如何接收新的连接
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            // 自定义处理类
                            socketChannel.pipeline().addLast(new HelloServerHandler());
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            // 绑定端口，接收进来的连接
            ChannelFuture f = b.bind(port).sync();

            // 等待服务器Socket关闭
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {
        new HelloServer(10110).run();
    }
}
