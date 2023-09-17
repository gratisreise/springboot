package jpabook.jpabook.service;

import jpabook.jpabook.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ItemUpdatedTest {
    @Test
    public void updateTest() throws Exception{
        Book book = em.find(Book.class, 1L);

        //TX
        book.setName("asdfasd");

        //변경감지 == dirty checking
        //TX commit


    }

}
