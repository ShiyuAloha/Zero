package com.sy.controller;

import com.sy.entity.User;
import com.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户ID查询用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    @GetMapping("/{id}")
    public User selectUserById(@PathVariable Integer id) {
        return userService.selectUserById(id);
    }

    /**
     * 查询所有用户信息
     * @return 用户信息列表
     */
    @GetMapping("/all")
    public List<User> selectAllUsers() {
        return userService.selectAllUsers();
    }

    /**
     * 插入用户信息
     * @param user 用户信息
     * @return 插入结果
     */
    @PostMapping("/insert")
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    /**
     * 根据用户ID更新用户信息
     * @param user 用户信息
     * @return 更新结果
     */
    @PutMapping("/update")
    public int updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    /**
     * 根据用户ID删除用户信息
     * @param id 用户ID
     * @return 删除结果
     */
    @DeleteMapping("/{id}")
    public int deleteUserById(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }
}