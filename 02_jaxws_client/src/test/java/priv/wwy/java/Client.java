package priv.wwy.java;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import priv.wwy.java.service.HelloService;

/**
 * @author wangweiye
 * @date 2021-09-01 14:52
 */
public class Client {
  public static void main(String[] args) {
      JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
      factory.setAddress("http://localhost:8009/ws/hello");
      factory.setServiceClass(HelloService.class);
      HelloService helloService = factory.create(HelloService.class);
      String content = helloService.sayHello("wangdaye");
      System.out.println(content);

  }
}
