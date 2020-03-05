package com.lirh.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lirh.gmall.pms.entity.Brand;
import com.lirh.gmall.pms.mapper.BrandMapper;
import com.lirh.gmall.pms.service.BrandService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-04
 */

@com.alibaba.dubbo.config.annotation.Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
