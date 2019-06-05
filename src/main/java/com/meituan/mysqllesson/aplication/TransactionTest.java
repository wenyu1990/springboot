package com.meituan.mysqllesson.aplication;

import com.meituan.mysqllesson.domain.dos.BookDO;
import com.meituan.mysqllesson.domain.dos.UserDO;
import com.meituan.mysqllesson.infrastructure.repository.repository.BookRepository;
import com.meituan.mysqllesson.infrastructure.repository.repository.BookStoreRepository;
import com.meituan.mysqllesson.infrastructure.repository.repository.OrderRepository;
import com.meituan.mysqllesson.infrastructure.repository.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 10:12
 */
@Service
public class TransactionTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Transactional(rollbackFor = Exception.class)
    public void buyBook() {
        String userName = "wenyu02";
        BookDO c = bookRepository.query("c");
        UserDO wenyu02 = userRepository.query(userName);

        orderRepository.insert(c.getId(), wenyu02.getId());
        int update = bookStoreRepository.update(c.getPrice());
        if (wenyu02.getMoney() > c.getPrice()) {
            userRepository.update(userName, c.getPrice());
        }else {
            throw new RuntimeException();
        }
    }

    public boolean checkAccount(String userName, int money) {
        return userRepository.query(userName).getMoney() > money;
    }


}
