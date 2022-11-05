package com.bzw.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bzw.Dao.BookDao;
import com.bzw.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;
    @Test
    void testGetById()
    {
        bookService.getById(1);
    }
    @Test
    void testSave()
    {
        Book book=new Book();
        book.setType("ceshi");
        book.setName("ceshiname");
        book.setDescription("ceshimiaoshu");
        bookService.save(book);
    }
    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }
}
