package com.syeftipay.backend.repository;


import com.syeftipay.backend.domain.account.AccountAuthToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface AccountAuthTokenRepository extends JpaRepository<AccountAuthToken, Long> {
  AccountAuthToken findFirstByAccountIdOrderByCreateAtDesc(@Param("accountId")long accountId);

  @Modifying
  @Transactional
  @Query(nativeQuery = true,
          value = "delete from account_auth_token where account_id = :accountId and token = :token")
  void deleteToken(@Param("accountId")long accountId, @Param("token")String token);
}
