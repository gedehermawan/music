package com.syeftipay.backend.repository;

import com.syeftipay.backend.domain.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long> {

  Account findByEmail(@Param("email")String email);
}
