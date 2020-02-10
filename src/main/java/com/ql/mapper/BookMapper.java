package com.ql.mapper;

import com.ql.domain.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

/**
 * @Author: QiuLan
 * @Date: 2020/2/9 5:20 下午
 */
public interface BookMapper {
//    增删改查书

    void addBook(Books book);
    void deleteBookById(@Param("bookid") int id);
    void updateBook(Books book);
    List<Books> queryAll();
    Books queryBookById(@Param("bookid") int id);
    Books queryBookByName(@Param("bookname") String bookname);
}
