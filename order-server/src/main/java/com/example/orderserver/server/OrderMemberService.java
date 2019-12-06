package com.example.orderserver.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: GaoJin Sun
 * @createTime: 2019/12/4 11:20.
 * @description:
 */
@Service
public class OrderMemberService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getOrderUserAll() {
        return restTemplate.getForObject("http://member-service/getAll", List.class);
    }
}
