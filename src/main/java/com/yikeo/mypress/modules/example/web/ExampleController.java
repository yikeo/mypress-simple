package com.yikeo.mypress.modules.example.web;

import com.yikeo.mypress.modules.example.entity.Example;
import com.yikeo.mypress.modules.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("example")
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    @RequestMapping("")
    public String example() {
        return "Hello, World";
    }

    @RequestMapping("/{id}")
    public Example example(@PathVariable Integer id) {
        return exampleService.selectById(id);
    }

    @RequestMapping("/all")
    public List<Example> all() {
        return exampleService.queryAll();
    }
}
