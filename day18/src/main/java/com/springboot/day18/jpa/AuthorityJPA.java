package com.springboot.day18.jpa;

import com.springboot.day18.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityJPA extends JpaRepository<Authority, String> {

}
