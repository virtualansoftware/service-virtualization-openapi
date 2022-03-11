package io.virtualan;


import javax.annotation.PostConstruct;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class DisableSpringDocQueryParameter {

  @PostConstruct
  @Order(Ordered.LOWEST_PRECEDENCE-1 )
  private void load(){
    System.setProperty("springdoc.swagger-ui.queryConfigEnabled","false");
  }
}
