package com.geekzhang.server1.controller;

import com.geekzhang.server1.clients.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: zhangpengzhi<geekzhang @ 1 6 3 . com>
 * @date: 2019/1/14 9:42 PM
 * @version: V1.0
 */
@RestController
public class TestController {

    @Autowired
    private Clients clients;

    @RequestMapping("/test")
    public String test() {
        return "This is server1";
    }

    @RequestMapping("/client")
    public String client() {
        return clients.test();
    }
}
