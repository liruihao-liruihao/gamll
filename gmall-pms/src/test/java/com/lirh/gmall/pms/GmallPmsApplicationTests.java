package com.lirh.gmall.pms;

import com.lirh.gmall.pms.entity.Brand;
import com.lirh.gmall.pms.entity.Product;
import com.lirh.gmall.pms.service.BrandService;
import com.lirh.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        Product abc = productService.getById(1);
//        System.out.println(abc.getName());
//        Brand brand = new Brand();
////        brand.setName("嘿嘿嘿");
////
////        brandService.save(brand);
        Brand byId = brandService.getById(53);
        System.out.println(byId.getName());


    }

}
