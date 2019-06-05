package com.meituan.mysqllesson.aplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 10:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionTestTest {
    @Autowired
    private TransactionTest transactionTest;

    @Test
    public void getBuyBook() {
        transactionTest.buyBook();
    }

}