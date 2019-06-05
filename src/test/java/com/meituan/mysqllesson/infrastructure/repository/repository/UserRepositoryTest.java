package com.meituan.mysqllesson.infrastructure.repository.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 11:33
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void insert() {
    }

    @Test
    public void query() {
    }

    @Test
    public void update() {
        userRepository.update("wenyu02", 70);
    }
}