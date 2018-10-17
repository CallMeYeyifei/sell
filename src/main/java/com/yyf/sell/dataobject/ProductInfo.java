package com.yyf.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ClassName ProductInfo
 * @Description TODO
 * @Author yeyifei
 * @Date 2018/10/13 10:20 PM
 * @Version 1.0
 **/
@Entity
@Data
public class ProductInfo {
    //商品ID 主键 无需自增固不需要@GeneratedValue
    @Id
    private String productId;

    //商品名称
    private String productName;

    //商品价格
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //商品描述
    private String productDescription;

    //商品小图
    private String productIcon;

    //商品状态0正常 1下架
    private Integer productStatus;

    //类目编号
    private Integer categoryType;
}
