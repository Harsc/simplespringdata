package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

//JpaRepository<Book, Long>
//BaseRepository<Book, Long>  ?
@Repository
public interface BookTwoRepository extends BaseRepository<Book, Long> {

    @Query("select b from Book b")
    List<Book> queryOne();

    @Query("select b from Book b where b.pageCount > ?1")
    List<Book> queryTwo(int pageCount);

    @Query("select b from  Book b where b.title = :title")
    List<Book> queryThree(@Param("title") String title);

    List<Book> findByPageCountGreaterThan(int pageCount, Sort sort);

    //query method return types
    //Page<Book> findByPageCountGreaterThan(int pageCount, Pageable pageable);
    //List<Book> findByPageCountGreaterThan(int pageCount, Pageable pageable);
    Slice<Book> findByPageCountGreaterThan(int pageCount, Pageable pageable);


    //Collection<Book> findByPageCountGreaterThan(int pageCount);
    //Iterator<Book> findByPageCountGreaterThan(int pageCount);

}
