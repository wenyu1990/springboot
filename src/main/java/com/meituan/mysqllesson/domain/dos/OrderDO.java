package com.meituan.mysqllesson.domain.dos;

import java.util.Date;
import lombok.*;

/**
 *
 *   表名: orderA
 *   订单
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDO {
    /**
     *   字段: id
     */
    private Integer id;

    /**
     *   字段: book_id
     */
    private Integer bookId;

    /**
     *   字段: user_id
     */
    private Integer userId;

    /**
     *   字段: create_time
     */
    private Date createTime;
}