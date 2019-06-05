package com.meituan.mysqllesson.infrastructure.repository.mapper;

import com.meituan.mysqllesson.domain.dos.BookDO;
import com.meituan.mysqllesson.domain.dos.BookDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper

public interface BookDOMapper {
    long countByExample(BookDOExample example);

    int deleteByExample(BookDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookDO record);

    int insertSelective(BookDO record);

    List<BookDO> selectByExample(BookDOExample example);

    BookDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookDO record, @Param("example") BookDOExample example);

    int updateByExample(@Param("record") BookDO record, @Param("example") BookDOExample example);

    int updateByPrimaryKeySelective(BookDO record);

    int updateByPrimaryKey(BookDO record);
}