package com.springboot.day24.book.controller;

import com.springboot.day24.book.bean.BookBean;
import com.springboot.day24.book.jpa.BookJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookJPA bookJPA;

    /**
     * 书籍列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<BookBean> list(){
        return bookJPA.findAll();
    }
}
