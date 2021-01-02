package com.tiramisu.project.controller;

import com.tiramisu.project.common.Result;
import com.tiramisu.project.entity.Example;
import com.tiramisu.project.mapper.ExampleMapper;
import com.tiramisu.project.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @Autowired
    private ExampleMapper exampleMapper;
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/addExample")
    public Result addExample(@RequestBody Example example){
        int i = exampleMapper.addExample(example);
        return Result.success(i > 0);
    }

    @PostMapping("/updateExample")
    public Result updateExample(@RequestBody Example example) {
        int i = exampleMapper.updateById(example);
        return Result.success(i > 0);
    }

}
