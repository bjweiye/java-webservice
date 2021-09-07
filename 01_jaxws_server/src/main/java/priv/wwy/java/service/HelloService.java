package priv.wwy.java.service;

import javax.jws.WebService;

/**
 * @author wangweiye
 * @date 2021-09-01 11:14
 */
@WebService
public interface HelloService {
    public String sayHello(String name);
}
