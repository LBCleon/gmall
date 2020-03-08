package com.leon.gmall.user.mapper;


import com.leon.gmall.beans.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.user.mapper
 * @date 2020/2/6 17:48
 */

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();

}
