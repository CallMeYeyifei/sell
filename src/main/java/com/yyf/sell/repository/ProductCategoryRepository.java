package com.yyf.sell.repository;

import com.yyf.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @title ProductCategoryRepository
 * @description
 * @author admin
 * @updateTime 2018/10/12 4:56 PM
 * @throws
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    //方法名为findByCategoryTypeIn 返回类型为List数组内层为ProductCategory泛型  参数为List内层泛型为Integer
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory findByCategoryId(Integer categoryId);
}
