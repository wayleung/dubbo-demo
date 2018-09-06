package com.way.test;

import org.springframework.stereotype.Service;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/6/2018 15:01
 * @Description:
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello, "+name;
    }
}
