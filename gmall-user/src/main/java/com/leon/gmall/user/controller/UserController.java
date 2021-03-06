package com.leon.gmall.user.controller;

import com.leon.gmall.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.user.controller
 * @date 2020/2/6 17:44
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMember = userService.getAllUser();
        return umsMember;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }

}
