package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("ALL")
@Service
public class BookService {
    @Autowired
    private BookRrepository bookRrepository;

    public void insertBook(Book book) {
        this.bookRrepository.save(book);
    }

/**
 * ??
 * Error:(22, 29) java: 无法将接口 org.springframework.data.repository.CrudRepository<T,ID>中的方法 save应用到给定类型;
 *   需要: S
 *   找到: java.util.List<com.example.entity.Book>
 *   原因: 推断类型不符合上限
 *     推断: java.util.List<com.example.entity.Book>
 *     上限: com.example.entity.Book
 */
/*    public void insertBook(List<Book> book) {
        this.bookRrepository.save(book);
    }*/
}