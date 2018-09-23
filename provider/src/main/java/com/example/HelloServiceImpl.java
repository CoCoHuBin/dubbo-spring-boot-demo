package com.example;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

@Service(version = "1.0.0", timeout = 5000)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        String traceId = RpcContext.getContext().getAttachment("traceId");

        System.out.println("Hello from consumer " + RpcContext.getContext().getRemoteAddressString());

        String message = "Hello, " + name + ", " + new Date();
        if (StringUtils.isNotBlank(traceId)) {
            System.err.println("traceId: " + traceId);
            message += ", traceId: " + traceId;
        }

        return message;
    }
}
