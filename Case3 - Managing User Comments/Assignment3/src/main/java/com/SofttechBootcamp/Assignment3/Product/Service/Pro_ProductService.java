package com.SofttechBootcamp.Assignment3.Product.Service;

import com.SofttechBootcamp.Assignment3.Product.Converter.Pro_ProductMapperConverter;
import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductDto;
import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductSaveDto;
import com.SofttechBootcamp.Assignment3.Product.Model.Pro_Product;
import com.SofttechBootcamp.Assignment3.Product.Service.EntityService.Pro_ProductEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Pro_ProductService {
    private final Pro_ProductEntityService proProductEntityService;

    public Pro_ProductDto saveProduct(Pro_ProductSaveDto proProductSaveDto){
       Pro_Product proProduct = Pro_ProductMapperConverter.INSTANCE.convertToProProductFromProProductDto(proProductSaveDto);
       proProduct = proProductEntityService.save(proProduct);

       Pro_ProductDto proProductDto = Pro_ProductMapperConverter.INSTANCE.convertToProProductDtoFromProProduct(proProduct);
       return proProductDto;
    }

    public List<Pro_ProductDto> findAllProducts(){
        List<Pro_Product> proProduct = proProductEntityService.findAll();
        List<Pro_ProductDto> proProductDtoList = Pro_ProductMapperConverter.INSTANCE.convertToProProductDtoList(proProduct);
        return proProductDtoList;
    }

    public Pro_ProductDto findById(Long id){
        Pro_Product proProduct = proProductEntityService.getIdWithControl(id);
        Pro_ProductDto proProductDto = Pro_ProductMapperConverter.INSTANCE.convertToProProductDtoFromProProduct(proProduct);
        return  proProductDto;
    }

    public Pro_ProductDto updateProductPrice(Long id, BigDecimal price){
       Pro_Product proProduct = proProductEntityService.update(id, price);
       Pro_ProductDto proProductDto = Pro_ProductMapperConverter.INSTANCE.convertToProProductDtoFromProProduct(proProduct);
       return proProductDto;
    }

    public void deleteProduct(Long id){
        proProductEntityService.delete(id);
    }



}
