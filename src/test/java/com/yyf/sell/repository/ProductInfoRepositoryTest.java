package com.yyf.sell.repository;

import com.yyf.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;

    @Test
    @Transactional
    @Rollback(false)
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(3);
        productInfo.setProductDescription("这是一款刺激的用品");
        productInfo.setProductIcon("");
        productInfo.setProductId("123456");
        productInfo.setProductName("跳蛋");
        productInfo.setProductPrice(new BigDecimal(123));
        productInfo.setProductStatus(0);//上架
        productInfo.setProductStock(20);//库存
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList);
    }
}