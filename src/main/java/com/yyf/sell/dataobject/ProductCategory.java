package com.yyf.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName ProductCategory
 * @Description TODO
 * @Author yeyifei
 * @Date 2018/10/12 4:38 PM
 * @Version 1.0
 **/
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /**类目ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**类目名称*/
    private String categoryName;

    /**类目编号*/
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
