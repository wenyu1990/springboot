package com.meituan.mysqllesson.infrastructure.repository.repository;

import com.meituan.mysqllesson.domain.dos.BookStoreDO;
import com.meituan.mysqllesson.domain.dos.BookStoreDOExample;
import com.meituan.mysqllesson.infrastructure.repository.mapper.BookStoreDOMapper;

import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 10:17
 */
@Repository
public class BookStoreRepository {
    @Resource
    private BookStoreDOMapper bookstoreDOMapper;

    public int query() {
        BookStoreDOExample bookstoreDOExample = new BookStoreDOExample();
        bookstoreDOExample.createCriteria();
        List<BookStoreDO> bookstoreDOS = bookstoreDOMapper.selectByExample(bookstoreDOExample);
        if (CollectionUtils.isEmpty(bookstoreDOS)) {
            return 0;
        }
        return bookstoreDOS.get(0).getAccount();
    }

    public int update(int account) {
        int query = this.query();
        return bookstoreDOMapper.updateByExample(BookStoreDO.builder().account(query + account).build(), new BookStoreDOExample());
    }
}
