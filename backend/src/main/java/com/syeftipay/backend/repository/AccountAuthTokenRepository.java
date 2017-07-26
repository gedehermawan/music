package com.syeftipay.backend.repository;


import com.syeftipay.backend.domain.account.AccountAuthToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface AccountAuthTokenRepository extends JpaRepository<AccountAuthToken, Long> {
  AccountAuthToken findFirstByAccountIdOrderByCreateAtDesc(@Param("accountId")long accountId);
}
