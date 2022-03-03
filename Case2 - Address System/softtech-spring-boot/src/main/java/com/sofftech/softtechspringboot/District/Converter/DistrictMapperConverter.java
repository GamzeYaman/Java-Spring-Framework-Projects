package com.sofftech.softtechspringboot.District.Converter;

import com.sofftech.softtechspringboot.District.Dto.DistrictDto;
import com.sofftech.softtechspringboot.District.Model.District;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DistrictMapperConverter {

    DistrictMapperConverter INSTANCE = Mappers.getMapper(DistrictMapperConverter.class);
    DistrictDto convertToDistrictDtoFromDistrict(District district);
    List<DistrictDto> convertToDistrictDtoList(List<District> districtList);
    District convertToDistrictFromDistrictDto(DistrictDto districtDto);

}