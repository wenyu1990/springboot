package com.meituan.mysqllesson.domain.dos;

import lombok.*;

/**
 *
 *   表名: book
 *   书籍
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDO {
    /**
     *   字段: id
     */
    private Integer id;

    /**
     *   字段: name
     */
    private String name;

    /**
     *   字段: price
     */
    private Integer price;
}