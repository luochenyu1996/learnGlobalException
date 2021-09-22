package com.chenyu;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@Slf4j
@SpringBootTest
class ApplicationTest {

    @Test
    void contextLoads() {
    }

    @Test
    void test01() {
        log.info("测试");
        System.out.println("测试类");

    }

}
