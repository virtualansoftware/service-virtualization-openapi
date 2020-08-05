package io.virtualan;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;


@EnableKafka
@Configuration
public class Config {

    @Autowired
    private EmbeddedKafkaBroker broker;

     @Bean
    public EmbeddedKafkaBroker broker() throws IOException {
        ServerSocket ss = ServerSocketFactory.getDefault().createServerSocket(9092);
        EmbeddedKafkaBroker embeddedKafkaBroker = new EmbeddedKafkaBroker(1, false) ;
        embeddedKafkaBroker.kafkaPorts(ss.getLocalPort());
         ss.close();
        return embeddedKafkaBroker;

    }

}