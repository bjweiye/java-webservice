package priv.wwy.java;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import priv.wwy.java.service.impl.HelloServiceImpl;

/**
 * @author wangweiye
 * @date 2021-09-01 11:21
 */
public class Server {
  public static void main(String[] args) {
      JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
      factory.setAddress("http://localhost:8009/ws/hello");
      factory.setServiceBean(new HelloServiceImpl());
      factory.getInInterceptors().add(new LoggingInInterceptor());
      factory.getOutInterceptors().add(new LoggingOutInterceptor());
      factory.create();
      System.out.println("服务发布成功，服务端口：8009....");
  }
}
