package com.meituan.mysqllesson.infrastructure.repository.repository;

import com.meituan.mysqllesson.domain.dos.OrderDO;
import com.meituan.mysqllesson.domain.dos.OrderDOExample;
import com.meituan.mysqllesson.infrastructure.repository.mapper.OrderDOMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 09:51
 */
@Resource
public class OrderRepository {
    @Resource
    private OrderDOMapper orderDOMapper;

    public int insert(Integer bookId, Integer userId) {
        return orderDOMapper.insert(OrderDO.builder().bookId(bookId).userId(userId).build());
    }

    public List<OrderDO> select(Integer bookId) {
        OrderDOExample orderDOExample = new OrderDOExample();
        orderDOExample.createCriteria().andBookIdEqualTo(bookId);
        return orderDOMapper.selectByExample(orderDOExample);
    }
}
