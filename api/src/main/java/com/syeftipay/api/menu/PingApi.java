package com.syeftipay.api.menu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController("syeftipay.api.menu.v1.PingApi")
@RequestMapping("/menu/v1")
public class PingApi {
  @RequestMapping(path = "/ping", method = GET, produces = TEXT_PLAIN_VALUE)
  public String ping() {
    String timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    return "Menu v1 | Pong at : "+timestamp;
  }
}
