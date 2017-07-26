package com.syeftipay.api.account.api.v1;

import com.syeftipay.api.mapping.MappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Date;

@Mapper(config = MappingConfig.class)
public abstract class AccountMapper {
  @Mapping(target = "accountId", source = "accountId")
  @Mapping(target = "email", source = "email")
  abstract Account accountToAccount(com.syeftipay.backend.domain.account.Account account);

  @Mapping(target = "accountId", ignore = true)
  @Mapping(target = "email", source = "email")
  @Mapping(target = "password", source = "password")
  @Mapping(target = "role", constant = "CUSTOMER")
  @Mapping(target = "createAt", expression = "java(getCurrentDate())")
  @Mapping(target = "updateAt", expression = "java(getCurrentDate())")
  @Mapping(target = "deleted", constant = "0")
  @Mapping(target = "createBy", ignore = true)
  @Mapping(target = "updateBy", ignore = true)
  abstract com.syeftipay.backend.domain.account.Account accountRequestToAccount(AccountRequest accountRequest);


  public Date getCurrentDate(){
    return new Date();
  }
}
