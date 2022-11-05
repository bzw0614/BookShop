package com.bzw.controller.util;

import com.bzw.Dao.BookDao;
import com.bzw.domain.Book;
import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;
    public R()
    {

    }
    public R(boolean flag)
    {
        this.flag=flag;
    }
    public R(boolean flag,Object data)
    {
        this.flag=flag;
        this.data=data;
    }
    public R(Boolean flag,String msg)
    {
        this.flag=flag;
        this.msg=msg;
    }
    public R(String msg)
    {
        this.msg=msg;
    }
}
