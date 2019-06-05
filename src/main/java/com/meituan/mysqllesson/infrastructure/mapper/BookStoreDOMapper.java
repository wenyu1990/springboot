package com.meituan.mysqllesson.infrastructure.mapper;

import com.meituan.mysqllesson.domain.dos.BookStoreDO;
import com.meituan.mysqllesson.domain.dos.BookStoreDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookStoreDOMapper {
    long countByExample(BookStoreDOExample example);

    int deleteByExample(BookStoreDOExample example);

    int insert(BookStoreDO record);

    int insertSelective(BookStoreDO record);

    List<BookStoreDO> selectByExample(BookStoreDOExample example);

    int updateByExampleSelective(@Param("record") BookStoreDO record, @Param("example") BookStoreDOExample example);

    int updateByExample(@Param("record") BookStoreDO record, @Param("example") BookStoreDOExample example);
}