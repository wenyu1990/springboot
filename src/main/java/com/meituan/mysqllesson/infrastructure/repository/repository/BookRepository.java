package com.meituan.mysqllesson.infrastructure.repository.repository;

import com.meituan.mysqllesson.domain.dos.BookDO;
import com.meituan.mysqllesson.infrastructure.repository.mapper.BookDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-05-31 15:04
 */
@Service
public class BookRepository {
    @Autowired
    private BookDOMapper bookDOMapper;

    public int insert(String name) {
        BookDO bookDO = new BookDO();
        bookDO.setName(name);
//        bookDO.setId(100);
        return bookDOMapper.insert(bookDO);
    }

}
