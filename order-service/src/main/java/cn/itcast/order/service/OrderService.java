package cn.itcast.order.service;

import cn.itcast.order.clients.*;
import cn.itcast.order.mapper.*;
import cn.itcast.order.pojo.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;


//    @Autowired
//    private RestTemplate restTemplate;
//
//    public Order queryOrderById(Long orderId) {
//        // 1.查询订单
//        Order order = orderMapper.findById(orderId);
//        // 2.查询用户信息
//        String url = "http://userservice:8081/user/" + order.getUserId();
//        User user = restTemplate.getForObject(url, User.class);
//        // 3.封装
//        order.setUser(user);
//        // 4.返回
//        return order;
//    }

    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.查询用户信息
        User user = userClient.find(order.getUserId());
        // 3.封装
        order.setUser(user);
        // 4.返回
        return order;
    }
}
