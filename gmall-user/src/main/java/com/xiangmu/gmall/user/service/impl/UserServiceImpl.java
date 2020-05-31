package com.xiangmu.gmall.user.service.impl;


import com.xiangmu.gmall.bean.UmsMember;
import com.xiangmu.gmall.bean.UmsMemberReceiveAddress;
import com.xiangmu.gmall.service.UserService;
import com.xiangmu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.xiangmu.gmall.user.mapper.UserMapper;
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

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList =userMapper.selectAll() ;//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }
}
