package com.sofftech.softtechspringboot.District.Service;

import com.sofftech.softtechspringboot.District.Converter.DistrictMapperConverter;
import com.sofftech.softtechspringboot.District.Dto.DistrictDto;
import com.sofftech.softtechspringboot.District.Model.District;
import com.sofftech.softtechspringboot.District.Service.EntityService.DistrictEntityService;
import com.sofftech.softtechspringboot.Neighborhood.Converter.NeighborhoodMapperConverter;
import com.sofftech.softtechspringboot.Neighborhood.Dto.NeighborhoodDto;
import com.sofftech.softtechspringboot.Neighborhood.Model.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictService {

    private final DistrictEntityService districtEntityService;

    public List<DistrictDto> findAll(){
        List<District> districtList = districtEntityService.findAll();
        List<DistrictDto> districtDtoList = DistrictMapperConverter.INSTANCE.convertToDistrictDtoList(districtList);

        return districtDtoList;
    }

    public DistrictDto addDistrict(DistrictDto districtDto){
        District district = DistrictMapperConverter.INSTANCE.convertToDistrictFromDistrictDto(districtDto);
        district = districtEntityService.saveDistrict(district);

        DistrictDto districtDtoAfterAdding = DistrictMapperConverter.INSTANCE.convertToDistrictDtoFromDistrict(district);
        return districtDtoAfterAdding;
    }
}
