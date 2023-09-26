package vsvdev.co.ua.micro.service;

import org.junit.jupiter.api.Test;
import vsvdev.co.ua.micro.entities.Greeting;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class GreetingServiceTest {

  private GreetingService service = new GreetingServiceImpl();


  @Test
  public void shouildReturnName() throws Exception {

    // given
    String expectedContent = "Hello, sv!";
    long expectedId = service.greet("").getId() + 1L;

    // when
    Greeting greeting = service.greet("sv");

    // then
    assertEquals(expectedId, greeting.getId());
    assertEquals(expectedContent, greeting.getContent());
  }

  @Test
  public void shouildReturnCount() throws Exception {

    // given
    long expectedId = service.greet("").getId() + 1L;
    String expectedContent = "Hello, World!";

    // when
    Greeting greeting = service.greet("");

    // then
    assertEquals(expectedId, greeting.getId());
  }

}
