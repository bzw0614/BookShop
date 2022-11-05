package com.bzw.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bzw.domain.Book;

public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage,int pageSize);
    boolean modify(Book book);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);
    boolean saveBook(Book book);

    boolean delete(Integer id);



}
