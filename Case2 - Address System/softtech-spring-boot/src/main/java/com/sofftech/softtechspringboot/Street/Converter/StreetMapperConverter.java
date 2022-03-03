package com.sofftech.softtechspringboot.Street.Converter;

import com.sofftech.softtechspringboot.Street.Dto.StreetDto;
import com.sofftech.softtechspringboot.Street.Model.Street;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StreetMapperConverter {

    StreetMapperConverter INSTANCE = Mappers.getMapper(StreetMapperConverter.class);
    StreetDto convertToStreetDtoFromStreet(Street street);
    List<StreetDto> convertToStreetDtoList(List<Street> streetList);
    Street convertToStreetFromStreetDto(StreetDto streetDto);

}
