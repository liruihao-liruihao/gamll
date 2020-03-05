package com.lirh.gmall.oms.service.impl;

import com.lirh.gmall.oms.entity.CartItem;
import com.lirh.gmall.oms.mapper.CartItemMapper;
import com.lirh.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-04
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
