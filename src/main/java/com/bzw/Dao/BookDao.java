package com.bzw.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bzw.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
