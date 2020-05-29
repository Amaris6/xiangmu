package com.xiangmu.gmall.user.service.impl;

import com.xiangmu.gmall.user.bean.UmsMember;
import com.xiangmu.gmall.user.mapper.UserMapper;
import com.xiangmu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: xiangmu
 * @Date: 2020/5/29 22:11
 * @Author: Mr.Hu
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList =userMapper.selectAll() ;//userMapper.selectAllUser();
        return umsMemberList;
    }
}
