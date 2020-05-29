package com.xiangmu.gmall.user.service.impl;

import com.xiangmu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: xiangmu
 * @Date: 2020/5/29 22:11
 * @Author: Mr.Hu
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserService userService;
}
