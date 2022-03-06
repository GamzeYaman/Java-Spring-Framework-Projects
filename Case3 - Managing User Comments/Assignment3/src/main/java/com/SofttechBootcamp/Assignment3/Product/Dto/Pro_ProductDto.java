package com.SofttechBootcamp.Assignment3.Product.Dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Pro_ProductDto {
    private long Id;
    private String productName;
    private BigDecimal productPrice;
}
