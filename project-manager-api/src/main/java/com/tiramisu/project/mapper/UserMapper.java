package com.tiramisu.project.mapper;

import com.tiramisu.project.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User getById(Integer id);

    Integer addUser(User user);

    Integer updateById(User user);

    Integer deleteById(Integer id);

    List<User> listUser();

}
