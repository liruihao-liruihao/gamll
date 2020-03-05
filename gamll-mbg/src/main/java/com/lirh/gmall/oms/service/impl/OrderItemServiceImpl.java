package com.lirh.gmall.oms.service.impl;

import com.lirh.gmall.oms.entity.OrderItem;
import com.lirh.gmall.oms.mapper.OrderItemMapper;
import com.lirh.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-04
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
