package com.sofftech.softtechspringboot.Country.Service;

import com.sofftech.softtechspringboot.Country.Converter.CountryMapperConverter;
import com.sofftech.softtechspringboot.Country.Dto.CountryDto;
import com.sofftech.softtechspringboot.Country.Model.Country;
import com.sofftech.softtechspringboot.Country.Service.EntityService.CountryEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryEntityService countryEntityService;
    //private final CountryConverter countryConverter;

    public List<CountryDto> findAll() {
        List<Country> countryList = countryEntityService.findAll();

        List<CountryDto> countryDtoList = CountryMapperConverter.INSTANCE.convertToCountryDtoList(countryList);

        return countryDtoList;
    }



    //post metodu
    public CountryDto addCountry(CountryDto countryDto) {
       Country country =  CountryMapperConverter.INSTANCE.convertToCountryFromCountryDto(countryDto);
       country = countryEntityService.saveCountry(country);

       CountryDto countryDtoAfterAdding = CountryMapperConverter.INSTANCE.convertToCountryDtoFromCountry(country);

       return countryDtoAfterAdding;
    }
}
