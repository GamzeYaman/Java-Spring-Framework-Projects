package com.sofftech.softtechspringboot.City.Dto;

import com.sofftech.softtechspringboot.Country.Model.Country;
import lombok.Data;

@Data
public class CityDto {
    private int Id;
    private String cityName;
    private String plaque;
}
