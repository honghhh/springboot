package com.springboot.day18.jpa;

import com.springboot.day18.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserJPA extends JpaRepository<User, String> {

    @Query("select u from User u where lower(u.username) = lower(:username)")
    User findByUsernameCaseInsensitive(@Param("username") String username);

}
