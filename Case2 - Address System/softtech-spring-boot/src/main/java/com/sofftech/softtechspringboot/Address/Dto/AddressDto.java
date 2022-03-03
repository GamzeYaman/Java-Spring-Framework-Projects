package com.sofftech.softtechspringboot.Address.Dto;

import com.sofftech.softtechspringboot.City.Model.City;
import com.sofftech.softtechspringboot.Country.Model.Country;
import com.sofftech.softtechspringboot.District.Model.District;
import com.sofftech.softtechspringboot.Neighborhood.Model.Neighborhood;
import com.sofftech.softtechspringboot.Street.Model.Street;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AddressDto {
    private Long Id;
    private Neighborhood neighborhoodId;
    private Street streetId;
    private District districtId;
    private City cityId;
    private Country countryId;
}
