package com.tiramisu.project.controller;

import com.tiramisu.project.common.Result;
import com.tiramisu.project.entity.User;
import com.tiramisu.project.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUser/{id}")
    public Result getUser(@PathVariable Integer id) {
        User result = userMapper.getById(id);
        return Result.success(result);
    }

    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user) {
        Integer res = userMapper.addUser(user);
        return Result.success(res > 0);
    }

    //修改用户信息
    @PostMapping("/updateUser")
    public Result updateUser(@RequestBody User user) {
        Integer res = userMapper.updateById(user);
        return Result.success(res > 0);
    }

    // 删除用户
    @PostMapping("/deleteUser/{id}")
    public Result deleteUser(@PathVariable Integer id) {
        Integer res = userMapper.deleteById(id);
        return Result.success(res > 0);
    }

    // 查询所有用户
    @GetMapping("/listUser")
    public Result listUser() {
        List<User> result = userMapper.listUser();
        return Result.success(result);
    }
}
