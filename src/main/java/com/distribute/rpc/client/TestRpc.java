package com.distribute.rpc.client;

import java.net.InetSocketAddress;
import java.util.concurrent.CountDownLatch;

import com.distribute.rpc.server.EchoService;
import com.distribute.rpc.server.EchoServiceImpl;
import com.distribute.rpc.server.RpcExporter;


public class TestRpc {
    public static void main(String[] args) throws Exception {
        final CountDownLatch latch = new CountDownLatch(1);
        new Thread(new Runnable() {
            public void run() {
                try {
                    latch.countDown();
                    RpcExporter.exporter("localhost", 8088);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        latch.await();
        RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("localhost", 8088));
        System.out.println(echo.echo("Henry, Are you ok ?"));
    }
}
