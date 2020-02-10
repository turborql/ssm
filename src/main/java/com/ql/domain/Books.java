package com.ql.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: QiuLan
 * @Date: 2020/2/9 5:17 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookid;
    private String bookname;
    private int bookcounts;
    private String detail;

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookcounts(int bookcounts) {
        this.bookcounts = bookcounts;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
