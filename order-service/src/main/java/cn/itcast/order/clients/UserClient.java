package cn.itcast.order.clients;

import cn.itcast.order.pojo.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.*;

@FeignClient("userservice")
public interface UserClient {

    @GetMapping("/user/{id}")
    User find(@PathVariable("id") Long id);
}
