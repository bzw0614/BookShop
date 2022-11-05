package com.bzw.Dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bzw.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }
    @Test
    void testSave()
    {
        Book book=new Book();
        book.setType("ceshi");
        book.setName("ceshiname");
        book.setDescription("ceshimiaoshu");
        bookDao.insert(book);
    }
    @Test
    void testDelete()
    {
        bookDao.deleteById(3);
    }
    @Test
    void testUpdate()
    {
        Book book=new Book();
        book.setId(2);
        book.setType("ceshi123");
        book.setName("ceshiname123");
        book.setDescription("ceshimiaoshu123");
        bookDao.updateById(book);
    }
    @Test
    void testGetall()
    {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetBy()
    {
        String name="ceshi";
        LambdaQueryWrapper<Book> lambdaQueryWrapper=new LambdaQueryWrapper<Book>();
        lambdaQueryWrapper.like(name!=null,Book::getName,name);
        bookDao.selectList(lambdaQueryWrapper);
    }
    @Test
    void testGetPage()
    {
        IPage page=new Page(1,5);
        bookDao.selectPage(page,null);
    }
}
