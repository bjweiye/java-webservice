package priv.wwy.java.service.impl;

import priv.wwy.java.service.HelloService;

import java.util.HashMap;

/**
 * @author wangweiye
 * @date 2021-09-01 11:18
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+",Welcome to Beijing.";
    }
}
