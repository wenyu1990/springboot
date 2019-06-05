package com.meituan.mysqllesson;

import com.meituan.mysqllesson.infrastructure.repository.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-05-31 17:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void insert() {
        int count = bookRepository.insert("java核心思想", 100);
        System.out.println(count);
    }
}