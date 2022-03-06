package com.SofttechBootcamp.Assignment3.Product.Converter;

import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductDto;
import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductSaveDto;
import com.SofttechBootcamp.Assignment3.Product.Model.Pro_Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Pro_ProductMapperConverter {

    Pro_ProductMapperConverter INSTANCE = Mappers.getMapper(Pro_ProductMapperConverter.class);
    Pro_Product convertToProProductFromProProductDto(Pro_ProductSaveDto proProductSaveDto);
    Pro_Product convertToProProductFromProProductDto(Pro_ProductDto proProductDto);
    Pro_ProductDto convertToProProductDtoFromProProduct(Pro_Product proProduct);
    List<Pro_ProductDto> convertToProProductDtoList(List<Pro_Product> proProductList);
}
