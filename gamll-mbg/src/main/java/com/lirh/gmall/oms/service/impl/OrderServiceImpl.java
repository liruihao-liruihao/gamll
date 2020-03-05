package com.lirh.gmall.oms.service.impl;

import com.lirh.gmall.oms.entity.Order;
import com.lirh.gmall.oms.mapper.OrderMapper;
import com.lirh.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-04
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
