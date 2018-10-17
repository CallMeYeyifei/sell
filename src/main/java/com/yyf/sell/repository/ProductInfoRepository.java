package com.yyf.sell.repository;

import com.yyf.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Project
 * @description 商品详情Repository
 * @author admin
 * @updateTime 2018/10/14 12:57 AM
 * @throws
 */

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
