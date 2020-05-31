package com.xiangmu.gmall.service;

import com.xiangmu.gmall.bean.UmsMember;
import com.xiangmu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @program: xiangmu
 * @Date: 2020/5/29 22:09
 * @Author: Mr.Hu
 * @Description:
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
