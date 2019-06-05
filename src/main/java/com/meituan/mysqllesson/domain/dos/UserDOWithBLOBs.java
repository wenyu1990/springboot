package com.meituan.mysqllesson.domain.dos;

/**
 *
 *   表名: user
 *   Users and global privileges
 */
public class UserDOWithBLOBs extends UserDO {
    /**
     *   字段: ssl_cipher
     */
    private byte[] sslCipher;

    /**
     *   字段: x509_issuer
     */
    private byte[] x509Issuer;

    /**
     *   字段: x509_subject
     */
    private byte[] x509Subject;

    /**
     *   字段: authentication_string
     */
    private String authenticationString;

    /**
     *   字段: User_attributes
     */
    private String userAttributes;
}