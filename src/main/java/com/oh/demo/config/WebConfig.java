package com.oh.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
  
  @Bean
  public String init() {
    return "init";
  }
}
