package com.ql.service;

import com.ql.domain.Books;
import com.ql.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: QiuLan
 * @Date: 2020/2/9 8:46 下午
 */
@Service
public class BookServicesImpl implements BookService {
//    private BookMapper bookMapper;
//
//    //////set方法使spring可以托管
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
        @Autowired
    private BookMapper bookMapper;

    public void addBook(Books book) {
        bookMapper.addBook(book);
    }

    public void deleteBookById(int id) {
        bookMapper.deleteBookById(id);
    }

    public void updateBook(Books book) {
        bookMapper.updateBook(book);
    }

    public List<Books> queryAll() {
        List<Books> books = bookMapper.queryAll();
        return books;
    }

    public Books queryBookById(int id) {
        Books book = bookMapper.queryBookById(id);
        return book;
    }

    public Books queryBookByName(String bookname) {
        Books book = bookMapper.queryBookByName(bookname);
        return book;
    }


}
