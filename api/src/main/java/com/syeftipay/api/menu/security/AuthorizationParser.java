package com.syeftipay.api.menu.security;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthorizationParser {
  Pattern pattern = Pattern.compile("([a-zA-Z]+)\\s*=\\s*\"([^\"]+)\"");

  public Result parse(String value) {
    int p = value.indexOf(" ");
    if (p < 1)
      return null;

    String type = value.substring(0, p);
    if (!"SyeftiPay".equals(type))
      return null;

    return parseValue(value.substring(p + 1));
  }

  private Result parseValue(String value) {
    Matcher m = pattern.matcher(value);
    if (!m.find())
      return null;

    String k1 = m.group(1);
    String v1 = m.group(2);

    if (!m.find())
      return null;

    String k2 = m.group(1);
    String v2 = m.group(2);

    if ("accountId".equals(k1) && !"token".equals(k2))
      return null;
    if ("accountId".equals(k2) && !"token".equals(k1))
      return null;

    if ("accountId".equals(k1))
      return new Result(v1, v2);
    else
      return new Result(v2, v1);
  }

  public static class Result {

    private final String accountId;
    private final String token;

    public Result(String accountId, String token) {
      this.accountId = accountId;
      this.token = token;
    }

    public String getAccountId() {
      return accountId;
    }

    public String getToken() {
      return token;
    }
  }
}