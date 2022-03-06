package com.SofttechBootcamp.Assignment3.Product.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRO_PRODUCT")
@Getter
@Setter
public class Pro_Product {

    @Id
    @SequenceGenerator(name = "Pro_Product", sequenceName = "PRO_PRODUCT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "Pro_Product")
    private long Id;

    @Column(name = "PRODUCT_NAME", length = 150, nullable = false)
    private String productName;

    @Column(name = "PRODUCT_PRICE", precision = 19, scale = 2, nullable = false)
    private BigDecimal productPrice;
}
