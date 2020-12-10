package org.smartgiveaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SmartGiveAwayApplication {

  public static void main(final String[] args) {
    SpringApplication.run(SmartGiveAwayApplication.class, args);
  }
}
