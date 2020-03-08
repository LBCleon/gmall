package com.leon.gmall.manage.mapper;

import com.leon.gmall.beans.PmsBaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Leon
 * @version V1.0
 * @Package com.leon.gmall.manage.mapper
 * @date 2020/2/8 20:41
 */
public interface PmsBaseAttrInfoMapper extends Mapper<PmsBaseAttrInfo> {
    List<PmsBaseAttrInfo> selectAttrValueListByValueId(String valueIdStr);
}
