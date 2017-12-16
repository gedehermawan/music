package com.music.backend.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
  Account findByEmailIgnoreCase(String email);
  Account findByEmail(String email);
}