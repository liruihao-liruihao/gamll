package com.lirh.gmall.pms.service.impl;

import com.lirh.gmall.pms.entity.Product;
import com.lirh.gmall.pms.mapper.ProductMapper;
import com.lirh.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-04
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
