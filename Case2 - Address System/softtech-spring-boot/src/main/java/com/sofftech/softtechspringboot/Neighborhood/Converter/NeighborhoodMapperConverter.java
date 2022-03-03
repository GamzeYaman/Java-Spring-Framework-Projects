package com.sofftech.softtechspringboot.Neighborhood.Converter;

import com.sofftech.softtechspringboot.Neighborhood.Dto.NeighborhoodDto;
import com.sofftech.softtechspringboot.Neighborhood.Model.Neighborhood;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NeighborhoodMapperConverter {

    NeighborhoodMapperConverter INSTANCE = Mappers.getMapper(NeighborhoodMapperConverter.class);
    NeighborhoodDto convertToNeighborhoodDtoFromNeighborhood(Neighborhood neighborhood);
    List<NeighborhoodDto> convertToNeighborhoodDtoList(List<Neighborhood> neighborhoodList);
    Neighborhood convertToNeighborhoodFromNeighborhoodDto(NeighborhoodDto neighborhoodDto);
}
