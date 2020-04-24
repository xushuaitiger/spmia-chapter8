package com.thoughtmechanix.licenses.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig{

  @Value("${example.property}")
  private String exampleProperty="";

  @Value("${redis.host}")
  private String redisServer="";

  @Value("${redis.port}")
  private String redisPort="";

  @Value("${redis.password}")
  private String redisPassword="";

  public String getExampleProperty(){
    return exampleProperty;
  }

  public String getRedisServer(){
    return redisServer;
  }

  public Integer getRedisPort(){
    return new Integer( redisPort ).intValue();
  }


  public String getRedisPassword() {
    return redisPassword;
  }
}
