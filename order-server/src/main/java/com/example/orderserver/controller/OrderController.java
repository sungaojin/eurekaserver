package com.example.orderserver.controller;

import com.example.orderserver.server.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: GaoJin Sun
 * @createTime: 2019/12/4 15:11.
 * @description:
 */
@RestController
public class OrderController {
    @Autowired
    private OrderMemberService orderMemberService;

    @RequestMapping("/getOrderUserAll")
    public List<String> getOrderUserAll() {
        System.out.println("订单服务开始调用会员服务");
        return orderMemberService.getOrderUserAll();
    }

    @RequestMapping("/getOrderServiceApi")
    public String getOrderServiceApi() {
        return "this is 订单服务";
    }
}
