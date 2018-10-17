package com.yyf.sell.repository;

import com.yyf.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional
    public void findOneTest(){
        ProductCategory productCategory = repository.getOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void saveTest(){
        ProductCategory productCategory = repository.getOne(12);
        productCategory.setCategoryType(8);
        repository.save(productCategory);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void saveNewTest(){
        ProductCategory productCategory = new ProductCategory("父母最爱",10);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        Assert.assertNotEquals(null,result);
    }

    @Test
    @Transactional
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,2,3,9);
        List<ProductCategory> result =repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }


}