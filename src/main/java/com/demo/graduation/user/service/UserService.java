package com.demo.graduation.user.service;

import com.demo.graduation.user.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * date 2018-02-01
 * description Userservice
 */
public interface UserService {
    /**
     * 根据条件查询一个
     *
     * @param user
     * @return User
     */
    public User selectOne(User user);

    /**
     * 根据id查询
     *
     * @param id
     * @return User
     */
    public User get(String id);

    /**
     * 查询符合条件的数据,不分页
     *
     * @param user
     * @return List<User>
     */
    public List<User> findList(User user);

    /**
     * 查询所有数据
     *
     * @return List<User>
     */
    public List<User> findAll();

    /**
     * 查询符合条件的数据,并且分页,默认pageNum=1,pageSize=100
     *
     * @param user
     * @return PageInfo<User>
     */
    public PageInfo<User> find(User user);

    /**
     * 保存
     *
     * @param user
     * @return User
     */
    public User save(User user);

    /**
     * 删除符合条件的数据
     *
     * @param user
     * @return int 删除条数
     */
    public int delete(User user);
}