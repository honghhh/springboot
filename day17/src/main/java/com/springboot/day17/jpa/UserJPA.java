package com.springboot.day17.jpa;

import com.springboot.day17.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * @description: 接口
 * @author: huangh
 * @createDate: 2019/3/9 14:02
 */
@Transactional
public interface UserJPA extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity>, Serializable {

    /* 使用注解配置自定义SQL，后面参数nativeQuery = true才是表明了使用原生的sql，
       如果不配置，默认是false，则使用HQL查询方式*/
    // 查询大于20岁的用户
    @Query(value = "select * from t_user where t_age > ?1", nativeQuery = true)
    public List<UserEntity> nativeQuery(int age);

    /* 使用@Query配合@Modifying一共使用，则可以完成数据的删除、添加、更新操作，需添加事务注解 */
    // 按条件删除用户
    @Modifying
    @Query(value = "delete from t_user where t_name = ?1 and t_pwd = ?2", nativeQuery = true)
    public void deleteQuery(String name, String pwd);

    // 使用SpringDataJPA方法定义查询
    public UserEntity findByUsername(String username);

}
