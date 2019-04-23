package com.dao;

import com.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/5 10:46
 * @Describe
 */
@Mapper
public interface Order2Dao {

    public void insert(Order order);
}
