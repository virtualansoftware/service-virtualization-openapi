package io.virtualan;


import javax.annotation.PostConstruct;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class DisableSpringDocQueryParameter {

  @PostConstruct
  @Order(11111)
  private void load(){
    System.setProperty("springdoc.swagger-ui.queryConfigEnabled","false");
  }
}
