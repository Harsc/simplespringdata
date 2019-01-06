package com.example;

import com.example.entity.Book;
import com.example.repository.BookTwoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.ParseException;

@SpringBootApplication
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws ParseException {
//        LOGGER.info("---------------start---------------");
        ConfigurableApplicationContext run = SpringApplication.run(Application.class);
        BookTwoRepository bean = run.getBean(BookTwoRepository.class);

/*        for (Book book : bean.queryTwo(200)) {
            System.out.println(book);
        }*/

/*        for (Book book : bean.findAll(new PageRequest(0,7))) {
            System.out.println(book);
        }*/

/*        for (Book book : bean.findByPageCountGreaterThan(150, new PageRequest(1, 2))) {
            System.out.println(book);
        }*/

/*        for (Book book : bean.findAll(new Sort(Sort.Direction.ASC,"author.lastName","pageCount"))) {
            System.out.println(book);
        }*/

/*        for (Book book : bean.findAll(new Sort(Sort.Direction.ASC,"author.lastName")
                .and(new Sort(Sort.Direction.ASC,"pageCount")))) {
            System.out.println(book);
        }*/

/*        for (Book book : bean.findByPageCountGreaterThan(300,new Sort("author.lastName"))) {
            System.out.println(book);
        }*/

/*  2?      for (Book book : bean.findByIds(2L, 7L)) {
            System.out.println(book);
        }*/



        /**
         * Hibernate: select book0_.book_id as book_id1_0_, book0_.page_count as page_cou2_0_,
         * book0_.price as price3_0_, book0_.publish_date as publish_4_0_, book0_.title as title5_0_
         * from book book0_ where book0_.title=?
         */
//        System.out.println(bean.findByTitle("Of Mice and Men"));


/*        bean.findByTitleLike("%of%");
        bean.findByTitleContaining("of");
        bean.findByTitleEndingWith("s")
        bean.findByTitleStartingWith("Design")
        */
/*        for (Book books : bean.findByTitleIgnoreCase("a tale of two cities")) {
            System.out.println(books);
        }*/


/*        for (Book books : bean.findByPageCountEquals(300)) {
            System.out.println(books);
        }*/


/*        for (Book books : bean.findByPublishDateBefore(new SimpleDateFormat("mm/dd/yyyy").parse("1/1/1943"))) {
            System.out.println(books);
        }*/


/*        for (Book books : bean.findByTitleContainingOrderByTitleAsc("a")) {
            System.out.println(books);
        }*/

/*        for (Book books : bean.findTopByOrderByPageCountDesc()) {
            System.out.println(books);
        }*/


/*        Book book = new Book();
        book.setPrice(new BigDecimal(26.1));
        book.setTitle("a life to live");
        book.setPublishDate(new Date());
        bean.save(book);
        System.out.println(book);*/

/*        List<Book> books = bean.findAll(new ArrayList<Long>() {{
            add(1L);
            add(3L);
            add(7L);
        }});
                for (Book all : books) {
            System.out.println(all);
        }
        */

/*        List<Book> books = BookUtil.create(5);
        List<Book> save = bean.save(books);//BookRrepository----options
        for (Iterator iterator = save.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }*/

/*        Book book1 = bean.findOne(1L);
        System.out.println("before-----" + book1);
        book1.setTitle("hello -wpr -acj");
        bean.save(book1);
        System.out.println("after-----" + book1);*/

/*        LOGGER.info("//////////////////////////////");
        List<Book> all = bean.findAll();
        for (Book books:all){
            System.out.println(books);
        }
        //deleteInBatch 分组
        bean.deleteInBatch(
                bean.findAll(new ArrayList<Long>(){{
                    add(1L);
                    add(3L);
                    add(7L);
                }})
        );
        LOGGER.info("?????????????????????????????");
        List<Book> all2 = bean.findAll();
        for (Book books:all2){
            System.out.println(books);
        }*/

//        System.out.println(bean.findOne(1L));
    }
}
