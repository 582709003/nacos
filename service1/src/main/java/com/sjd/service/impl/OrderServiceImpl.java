package com.sjd.service.impl;/**
 * @projectname nacos
 * @author xinao
 * @create 2021/11/5
 */

import com.sjd.mapper.OrderMapper;
import com.sjd.model.TabOrder;
import com.sjd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sunjidong
 * @Date 2021/11/5
 * @Describtion
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    public boolean create() {
        TabOrder order = new TabOrder();
        order.setCount(2)
                .setId(2l)
                .setProductId(1l)
                .setUserId(1l);
        return orderMapper.insert(order) > 0;
    }}
