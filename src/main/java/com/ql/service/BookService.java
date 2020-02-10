package com.ql.service;

import com.ql.domain.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: QiuLan
 * @Date: 2020/2/9 8:45 下午
 */

public interface BookService {
    void addBook(Books book);
    void deleteBookById(int id);
    void updateBook(Books book);
    List<Books> queryAll();
    Books queryBookById( int id);
    Books queryBookByName(String bookname);

}
