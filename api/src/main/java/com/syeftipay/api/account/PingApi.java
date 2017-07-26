package com.syeftipay.api.account;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController("syeftipay.api.account.v1.PingApi")
@RequestMapping("/account/v1")
public class PingApi {
  @RequestMapping(path = "/ping", method = GET, produces = TEXT_PLAIN_VALUE)
  public String ping() {
    String timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    return "Account v1 | Pong at : "+timestamp;
  }
}
