package com.meituan.mysqllesson.infrastructure.repository.repository;

import com.meituan.mysqllesson.domain.dos.UserDO;
import com.meituan.mysqllesson.domain.dos.UserDOExample;
import com.meituan.mysqllesson.infrastructure.repository.mapper.UserDOMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author wenyu02
 * @date 2019-06-04 10:14
 */
@Repository
public class UserRepository {
    @Resource
    private UserDOMapper userDOMapper;

    public int insert(String userName, int money) {
        return userDOMapper.insert(UserDO.builder().name(userName).money(money).build());
    }

    public UserDO query(String userName) {
        UserDOExample userDOExample = new UserDOExample();
        userDOExample.createCriteria().andNameEqualTo(userName);
        return userDOMapper.selectByExample(userDOExample).get(0);
    }

    public int update(String name, int money) {
        UserDOExample userDOExample = new UserDOExample();
        userDOExample.createCriteria().andNameEqualTo(name);
        UserDO query = this.query(name);
        return userDOMapper.updateByExampleSelective(UserDO.builder().money(query.getMoney() - money).build(), userDOExample);
    }
}
