package com.xiangmu.gmall.user.mapper;

import com.xiangmu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @program: xiangmu
 * @Date: 2020/5/29 22:08
 * @Author: Mr.Hu
 * @Description:
 */
public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();
}
