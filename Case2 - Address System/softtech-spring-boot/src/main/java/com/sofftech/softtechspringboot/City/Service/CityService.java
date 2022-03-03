package com.sofftech.softtechspringboot.City.Service;

import com.sofftech.softtechspringboot.City.Converter.CityMapperConverter;
import com.sofftech.softtechspringboot.City.Dto.CityDto;
import com.sofftech.softtechspringboot.City.Model.City;
import com.sofftech.softtechspringboot.City.Service.EntityService.CityEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityEntityService cityEntityService;

    public List<CityDto> findAll(){
        List<City> cityList = cityEntityService.findAll();
        List<CityDto> getCityList = CityMapperConverter.INSTANCE.convertToCityDtoList(cityList);
        return getCityList;
    }

    public CityDto addCity(CityDto cityDto) {
        City city =  CityMapperConverter.INSTANCE.convertToCityFromCityDto(cityDto);
        city = cityEntityService.saveCity(city);

        CityDto cityDtoAfterAdding = CityMapperConverter.INSTANCE.convertToCityDtoFromCity(city);

        return cityDtoAfterAdding;
    }
}
