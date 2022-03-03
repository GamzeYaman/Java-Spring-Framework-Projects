package com.sofftech.softtechspringboot.Country.Converter;

import com.sofftech.softtechspringboot.Country.Dto.CountryDto;
import com.sofftech.softtechspringboot.Country.Model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapperConverter {

    CountryMapperConverter INSTANCE = Mappers.getMapper(CountryMapperConverter.class);
    CountryDto convertToCountryDtoFromCountry(Country country);
    List<CountryDto> convertToCountryDtoList(List<Country> countryList);
    Country convertToCountryFromCountryDto(CountryDto countryDto);


}
