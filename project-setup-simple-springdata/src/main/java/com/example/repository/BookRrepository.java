package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
//JpaRepository<Book, Long>
@Repository
public interface BookRrepository extends JpaRepository<Book, Long> {

    Book findByTitle(String title);

    List<Book> findByTitleLike(String title);

    //    包含
    List<Book> findByTitleContaining(String title);

    //    以什么开头
    List<Book> findByTitleStartingWith(String title);

    //    以什么结尾
    List<Book> findByTitleEndingWith(String title);

    //    忽略大小写  where upper(book0_.title)=upper(?)
    List<Book> findByTitleIgnoreCase(String title);

    List<Book> findByPageCountEquals(int pageCount);

    //   >
    List<Book> findByPageCountGreaterThan(int pageCount);

    //   <
    List<Book> findByPageCountLessThan(int pageCount);

    //    >=
    List<Book> findByPageCountGreaterThanEqual(int pageCount);

    //    <=
    List<Book> findByPageCountLessThanEqual(int pageCount);

    //   之间
    List<Book> findByPageCountBetween(int min, int max);

    List<Book> findByTitleContainingOrTitleContaining(String x, String y);

    List<Book> findByTitleContainingAndPageCountGreaterThan(String x, int i);

    List<Book> findByTitleNot(String x);

    List<Book> findByPublishDateAfter(Date date);

    List<Book> findByPublishDateBefore(Date date);

    List<Book> findByPublishDateBetween(Date x, Date y);

    //
    List<Book> findByTitleContainingOrderByTitleAsc(String title);

    List<Book> findByTitleContainingOrderByTitleDesc(String title);

    //
    List<Book> findTopByOrderByPageCountDesc();

    List<Book> findFirstByOrderByPageCountAsc();

    List<Book> findTop5ByOrderByPriceDesc();

    List<Book> findTop5ByTitleOrderByPriceAsc(String title);
}
