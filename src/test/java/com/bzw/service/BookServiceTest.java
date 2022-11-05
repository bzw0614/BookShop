package com.bzw.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bzw.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService IbookService;
    @Test
    void testGetById()
    {
        IbookService.getById(1);
    }
    @Test
    void testSave()
    {
        Book book=new Book();
        book.setType("ceshi123456");
        book.setName("ceshiname123456");
        book.setDescription("ceshimiaoshu123123456");
        IbookService.save(book);
    }
    @Test
    void testDelete()
    {
        IbookService.removeById(3);
    }
    @Test
    void testUpdate()
    {
        Book book=new Book();
        book.setType("ceshi123456");
        book.setName("ceshiname123456");
        book.setDescription("ceshimiaoshu123456");
        IbookService.updateById(book);
    }
    @Test
    void testGetall()
    {
        IbookService.list();
    }
    @Test
    void testGetPage()
    {
        IPage<Book> page=new Page<Book>(1,5);
        IbookService.page(page);
    }
}
