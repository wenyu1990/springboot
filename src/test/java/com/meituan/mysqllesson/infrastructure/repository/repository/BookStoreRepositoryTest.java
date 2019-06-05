package com.meituan.mysqllesson.infrastructure.repository.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 10:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookStoreRepositoryTest {
    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Test
    public void query() {
        bookStoreRepository.query();
    }

    @Test
    public void update() {
        bookStoreRepository.update(100);
    }
}