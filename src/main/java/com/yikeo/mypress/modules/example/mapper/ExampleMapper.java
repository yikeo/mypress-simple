package com.yikeo.mypress.modules.example.mapper;

import com.yikeo.mypress.modules.example.entity.Example;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExampleMapper {

    int save(Example example);

    Example selectById(Integer id);

    int updateById(Example example);

    int deleteById(Integer id);

    List<Example> queryAll();

}
