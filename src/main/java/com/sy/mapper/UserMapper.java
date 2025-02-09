package com.sy.mapper;

import com.sy.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据用户ID查询用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    User selectUserById(Integer id);

    /**
     * 查询所有用户信息
     * @return 用户信息列表
     */
    List<User> selectAllUsers();

    /**
     * 插入用户信息
     * @param user 用户信息
     * @return 插入结果
     */
    int insertUser(User user);

    /**
     * 根据用户ID更新用户信息
     * @param user 用户信息
     * @return 更新结果
     */
    int updateUser(User user);

    /**
     * 根据用户ID删除用户信息
     * @param id 用户ID
     * @return 删除结果
     */
    int deleteUserById(Integer id);
}