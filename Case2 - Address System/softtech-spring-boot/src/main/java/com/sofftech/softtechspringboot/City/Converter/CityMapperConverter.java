package com.sofftech.softtechspringboot.City.Converter;


import com.sofftech.softtechspringboot.City.Dto.CityDto;
import com.sofftech.softtechspringboot.City.Model.City;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CityMapperConverter {

    CityMapperConverter INSTANCE = Mappers.getMapper(CityMapperConverter.class);
    CityDto convertToCityDtoFromCity(City city);
    List<CityDto> convertToCityDtoList(List<City> cityList);
    City convertToCityFromCityDto(CityDto cityDto);
}
