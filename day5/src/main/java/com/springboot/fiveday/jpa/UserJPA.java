package com.springboot.fiveday.jpa;

import com.springboot.fiveday.entity.UserEneity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
* @description: 接口
* @author:      huangh
* @createDate:  2019/3/9 14:02
*/
public interface UserJPA extends JpaRepository<UserEneity, Long>, JpaSpecificationExecutor<UserEneity>, Serializable {

    

}
