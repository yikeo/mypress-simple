package com.yikeo.mypress.modules.example.service;

import com.yikeo.mypress.modules.example.entity.Example;
import com.yikeo.mypress.modules.example.mapper.ExampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    @Autowired
    ExampleMapper exampleMapper;

    public String greet() {
        return "Hello, World";
    }

    public Example selectById(Integer id) {
        return exampleMapper.selectById(id);
    }

    public List<Example> queryAll() {
        return exampleMapper.queryAll();
    }
}
