package com.ql.controller;

import com.mysql.cj.Session;
import com.ql.domain.Books;
import com.ql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: QiuLan
 * @Date: 2020/2/10 8:49 上午
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServicesImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = bookService.queryAll();
        model.addAttribute("list", books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPage() {

        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books book) {
        System.out.println("book===>" + book);
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }


    @RequestMapping("/toUpdateBook")
    public String toupdateBook(int id, Model model) {
        Books book = bookService.queryBookById(id);
        model.addAttribute("QBook", book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book) {
        System.out.println("+++====updateBook" + book);
        bookService.updateBook(book);
        System.out.println("============");
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBookByName(String queryBookName, Model model) {
        Books books = bookService.queryBookByName(queryBookName);


        System.err.println("queryBookName:========>" + books);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if (books == null) {
            list = bookService.queryAll();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list", list);
        return "allBook";
    }


}
