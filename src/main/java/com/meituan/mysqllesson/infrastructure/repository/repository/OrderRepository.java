package com.meituan.mysqllesson.infrastructure.repository.repository;

import com.meituan.mysqllesson.domain.dos.OrderDO;
import com.meituan.mysqllesson.domain.dos.OrderDOExample;
import com.meituan.mysqllesson.infrastructure.repository.mapper.OrderDOMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 09:51
 */
@Repository
public class OrderRepository {
    @Resource
    private OrderDOMapper orderDOMapper;

    public int insert(Integer bookId, Integer userId) {
        return orderDOMapper.insertSelective(OrderDO.builder().bookId(bookId).userId(userId).build());
    }

    public List<OrderDO> select(Integer bookId) {
        OrderDOExample orderDOExample = new OrderDOExample();
        orderDOExample.createCriteria().andBookIdEqualTo(bookId);
        return orderDOMapper.selectByExample(orderDOExample);
    }
}
