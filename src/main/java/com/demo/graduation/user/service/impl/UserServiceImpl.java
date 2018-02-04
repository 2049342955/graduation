package com.demo.graduation.user.service.impl;

import com.demo.graduation.common.entity.BaseDomain;
import com.demo.graduation.user.entity.User;
import com.demo.graduation.user.mapper.UserMapper;
import com.demo.graduation.user.service.UserService;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * date 2018-02-01
 * description Userservice
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList(User user) {
        return userMapper.select(user);
    }

    @Override
    public User selectOne(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public User get(String id) {
        User user = new User();
        user.setId(id);
        return userMapper.selectByPrimaryKey(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public PageInfo<User> find(User user) {
        if (user.getPageNum() == null)
            user.setPageNum(BaseDomain.DEFALUT_PAGE_NUM);
        if (user.getPageSize() == null)
            user.setPageSize(BaseDomain.DEFALUT_PAGE_SIZE);
        return PageHelper.startPage(user.getPageNum(), user.getPageSize()).setOrderBy(user.getOrderBy()).doSelectPageInfo(new ISelect() {
            @Override
            public void doSelect() {
                userMapper.select(user);
            }
        });
    }

    @Override
    public User save(User user) {
        if (StringUtils.isEmpty(user.getId())) {
            userMapper.insert(user);
        } else {
            userMapper.updateByPrimaryKeySelective(user);
        }
        return user;
    }

    @Override
    public int delete(User user) {
        return userMapper.delete(user);
    }
}