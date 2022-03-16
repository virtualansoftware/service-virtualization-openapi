package io.virtualan;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DisableSpringDocQueryParameter
implements ApplicationListener<ApplicationReadyEvent> {


  @Override
  public void onApplicationEvent(final ApplicationReadyEvent event) {

    System.setProperty("springdoc.swagger-ui.queryConfigEnabled", "false");

    return;
  }

} 
