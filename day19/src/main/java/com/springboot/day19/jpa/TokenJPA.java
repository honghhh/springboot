package com.springboot.day19.jpa;

import com.springboot.day19.entity.TokenInfoEntity;
import com.springboot.day19.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * TokenJPA
 * @author: huangh
 */
public interface TokenJPA extends JpaRepository<TokenInfoEntity,String>, JpaSpecificationExecutor<TokenInfoEntity> {

}
