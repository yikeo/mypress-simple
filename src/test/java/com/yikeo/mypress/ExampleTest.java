package com.yikeo.mypress;

import static org.assertj.core.api.Assertions.assertThat;

import com.yikeo.mypress.modules.example.web.ExampleController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleTest {


    @Autowired
    private ExampleController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

}
