package com.distribute.rpc.server;

import com.distribute.rpc.server.EchoService;

public class EchoServiceImpl implements EchoService {
    public String echo(String ping) {
        return ping != null ? ping + " --> I am ok." : " I am ok.";
    }
}
