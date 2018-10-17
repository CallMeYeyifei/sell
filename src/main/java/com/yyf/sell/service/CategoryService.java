package com.yyf.sell.service;

import com.yyf.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CategoryService
 * @Description 类目
 * @Author yeyifei
 * @Date 2018/10/13 6:41 PM
 * @Version 1.0
 **/
public interface CategoryService {
    //卖家段查一个
    ProductCategory findByCategoryId(Integer categoryId);

    //卖家段查询全部
    List<ProductCategory> findAll();

    //买家端查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);

    ProductCategory save(ProductCategory productCategory);
}
