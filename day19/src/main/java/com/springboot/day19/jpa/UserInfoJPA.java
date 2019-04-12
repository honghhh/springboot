package com.springboot.day19.jpa;

import com.springboot.day19.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * UserInfoJPA
 * @author: huangh
 */
public interface UserInfoJPA extends JpaRepository<UserInfoEntity,String>, JpaSpecificationExecutor<UserInfoEntity> {

}
