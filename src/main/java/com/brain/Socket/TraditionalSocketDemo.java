package com.brain.Socket;

import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 传统socket
 *
 */
@Log4j
public class TraditionalSocketDemo {

     public static void main(String[] args) throws IOException {
         ServerSocket serverSocket = new ServerSocket(7777);
         log.info("服务端启动");

         while(true){
             Socket socket = serverSocket.accept();
             log.info("有新客户端连接上来了");

             InputStream inputStream = socket.getInputStream();
             byte[] b = new byte[1024];

             while(true){
                 int data = inputStream.read();
                 String str = new String(b,0,data,"GBK");
                 log.info(str);
             }

         }
    }
}
