package com.meituan.mysqllesson.domain.dos;

import lombok.*;

/**
 *
 *   表名: bookstore
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookStoreDO {
    /**
     *   字段: account
     */
    private Integer account;
}