package com.syeftipay.backend.repository;


import com.syeftipay.backend.domain.account.AccountAuthToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountAuthTokenRepository extends JpaRepository<AccountAuthToken, Long> {
}
