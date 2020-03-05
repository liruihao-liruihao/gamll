package com.lirh.gamll.pms;

import com.lirh.gmall.pms.entity.Product;
import com.lirh.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GamllPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    public void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId);

    }

}
