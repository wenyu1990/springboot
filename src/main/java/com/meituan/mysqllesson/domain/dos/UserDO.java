package com.meituan.mysqllesson.domain.dos;

import lombok.*;

/**
 *
 *   表名: user
 *   Users and global privileges
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDO {
    /**
     *   字段: id
     */
    private Integer id;

    /**
     *   字段: name
     */
    private String name;

    /**
     *   字段: money
     */
    private Integer money;
}