package com.example;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class UsingSpringbootStartSpringdataApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(UsingSpringbootStartSpringdataApplication.class, args);
        BookRepository bookRepository = context.getBean(BookRepository.class);
        Book book = new Book();
        book.setPageCount(200);
        book.setTitle("Hello World");
        book.setPrice(new BigDecimal("100.0"));
        book.setPublishDate(new Date());

        bookRepository.save(book);
    }
}
