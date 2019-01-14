package com.geekzhang.server1.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @author: zhangpengzhi<geekzhang @ 1 6 3 . com>
 * @date: 2019/1/14 9:42 PM
 * @version: V1.0
 */
@FeignClient("server2")
public interface Clients {

    @RequestMapping("/test")
    String test();
}
