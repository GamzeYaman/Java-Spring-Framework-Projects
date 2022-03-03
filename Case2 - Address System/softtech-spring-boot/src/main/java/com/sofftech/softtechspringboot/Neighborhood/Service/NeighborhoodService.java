package com.sofftech.softtechspringboot.Neighborhood.Service;

import com.sofftech.softtechspringboot.Neighborhood.Converter.NeighborhoodMapperConverter;
import com.sofftech.softtechspringboot.Neighborhood.Dto.NeighborhoodDto;
import com.sofftech.softtechspringboot.Neighborhood.Model.Neighborhood;
import com.sofftech.softtechspringboot.Neighborhood.Service.EntityService.NeighborhoodEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NeighborhoodService {

    private final NeighborhoodEntityService neighborhoodEntityService;

    public List<NeighborhoodDto> findAll(){
        List<Neighborhood> neighborhoodList = neighborhoodEntityService.findAll();
        List<NeighborhoodDto> neighborhoodDtoList = NeighborhoodMapperConverter.INSTANCE.convertToNeighborhoodDtoList(neighborhoodList);

        return neighborhoodDtoList;
    }

    public NeighborhoodDto addNeighborhood(NeighborhoodDto neighborhoodDto){
        Neighborhood neighborhood = NeighborhoodMapperConverter.INSTANCE.convertToNeighborhoodFromNeighborhoodDto(neighborhoodDto);
        neighborhood = neighborhoodEntityService.saveNeighborhood(neighborhood);

        NeighborhoodDto neighborhoodDtoAfterAdding = NeighborhoodMapperConverter.INSTANCE.convertToNeighborhoodDtoFromNeighborhood(neighborhood);
        return neighborhoodDtoAfterAdding;
    }

    public NeighborhoodDto update(NeighborhoodDto neighborhoodDto) throws Exception {
        Long id = neighborhoodDto.getId();
        boolean isExist = neighborhoodEntityService.existById(id);

        Neighborhood neighborhoodUpdate;
        if(isExist){
            neighborhoodUpdate = NeighborhoodMapperConverter.INSTANCE.convertToNeighborhoodFromNeighborhoodDto(neighborhoodDto);
            neighborhoodEntityService.saveNeighborhood(neighborhoodUpdate);
        }else{
            throw new Exception("Neighborhood couldn't be found!");
        }

        NeighborhoodDto neighborhoodDtoUpdate = NeighborhoodMapperConverter.INSTANCE.convertToNeighborhoodDtoFromNeighborhood(neighborhoodUpdate);
        return neighborhoodDtoUpdate;
    }
}
