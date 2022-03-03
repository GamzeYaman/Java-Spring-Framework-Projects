package com.sofftech.softtechspringboot.District.Dto;

import com.sofftech.softtechspringboot.City.Model.City;
import lombok.Data;

@Data
public class DistrictDto {
    private Long Id;
    private String districtName;
    private City city;
}
