package com.meituan.mysqllesson.infrastructure.repository.mapper;

import com.meituan.mysqllesson.domain.dos.OrderDO;
import com.meituan.mysqllesson.domain.dos.OrderDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDOMapper {
    long countByExample(OrderDOExample example);

    int deleteByExample(OrderDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDO record);

    int insertSelective(OrderDO record);

    List<OrderDO> selectByExample(OrderDOExample example);

    OrderDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDO record, @Param("example") OrderDOExample example);

    int updateByExample(@Param("record") OrderDO record, @Param("example") OrderDOExample example);

    int updateByPrimaryKeySelective(OrderDO record);

    int updateByPrimaryKey(OrderDO record);
}