package com.example.memberserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: GaoJin Sun
 * @createTime: 2019/12/3 15:57.
 * @description:
 */
@RestController
public class MemberController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getAll")
    public List<String> getAll() {
        List<String> listUser = new ArrayList<>();
        listUser.add("张三");
        listUser.add("李四");
        listUser.add("王五");
        listUser.add("serverPort:" + serverPort);
        return listUser;
    }

    @RequestMapping("/getMemberServiceApi")
    public String getMemberServiceApi() {
        return "this is 会员服务";
    }
}
