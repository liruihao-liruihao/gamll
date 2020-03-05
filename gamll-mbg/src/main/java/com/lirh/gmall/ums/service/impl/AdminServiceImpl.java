package com.lirh.gmall.ums.service.impl;

import com.lirh.gmall.ums.entity.Admin;
import com.lirh.gmall.ums.mapper.AdminMapper;
import com.lirh.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-04
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
