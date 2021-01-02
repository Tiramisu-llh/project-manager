package com.tiramisu.project.mapper;
import com.tiramisu.project.entity.Example;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExampleMapper {

    Example selectExampleById(Integer id);

    int addExample(Example example);


    Example selectById(@Param("id")Integer id);

	List<Example> selectByName(@Param("name")String name);

    List<Example> selectByNameAndRemark(@Param("name")String name,@Param("remark")String remark);

	List<Example> selectByRemark(@Param("remark")String remark);




    int insert(Example record);

    int updateById(Example example);
}