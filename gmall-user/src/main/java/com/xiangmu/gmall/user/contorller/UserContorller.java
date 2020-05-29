package com.xiangmu.gmall.user.contorller;

import com.xiangmu.gmall.user.bean.UmsMember;
import com.xiangmu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: xiangmu
 * @Date: 2020/5/29 22:08
 * @Author: Mr.Hu
 * @Description:
 */
@Controller
public class UserContorller {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hi";
    }
}
