package com.meituan.mysqllesson.infrastructure.repository;

import com.meituan.mysqllesson.domain.dos.BookDO;
import com.meituan.mysqllesson.domain.dos.BookDOExample;
import com.meituan.mysqllesson.infrastructure.repository.mapper.BookDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-05-31 15:04
 */
@Repository
public class BookRepository {
    @Autowired
    private BookDOMapper bookDOMapper;

    public int insert(String name, int price) {
        BookDO bookDO = new BookDO();
        bookDO.setName(name);
        bookDO.setPrice(price);
        return bookDOMapper.insert(bookDO);
    }

    public BookDO query(String name) {
        BookDOExample bookDOExample = new BookDOExample();
        bookDOExample.createCriteria().andNameEqualTo(name);
        return bookDOMapper.selectByExample(bookDOExample).get(0);
    }
}
