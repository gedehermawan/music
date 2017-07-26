package com.syeftipay.api.account.api.v1;

import com.syeftipay.api.handler.JsonErrorResponse;
import com.syeftipay.backend.domain.account.Role;
import com.syeftipay.backend.service.account.AccountAlreadyExistException;
import com.syeftipay.backend.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController("syeftipay.api.account.v1.AccountApi")
@RequestMapping("/account/v1")
public class AccountApi {
  @Autowired
  private AccountService accountService;

  @Autowired
  private AccountMapper accountMapper;

  @RequestMapping(path = "/register", method = POST, consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
  public Account registerAccount(@RequestBody AccountRequest request) {
    com.syeftipay.backend.domain.account.Account account = accountMapper.accountRequestToAccount(request);
    return accountMapper.accountToAccount(accountService.register(account));
  }

  @ExceptionHandler(AccountAlreadyExistException.class)
  @ResponseStatus(code = HttpStatus.CONFLICT)
  public JsonErrorResponse handleAccountAlreadyExist(AccountAlreadyExistException e) {
    String msg = e.getMessage();
    return new JsonErrorResponse(HttpStatus.CONFLICT.value(), msg);
  }
}
