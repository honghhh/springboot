package com.springboot.day8.jpa;

import com.springboot.day8.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerJPA extends JpaRepository<LoggerEntity,Long> {

}
