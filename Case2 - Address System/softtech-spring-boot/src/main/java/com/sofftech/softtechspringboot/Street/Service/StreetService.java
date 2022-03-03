package com.sofftech.softtechspringboot.Street.Service;

import com.sofftech.softtechspringboot.Street.Converter.StreetMapperConverter;
import com.sofftech.softtechspringboot.Street.Dto.StreetDto;
import com.sofftech.softtechspringboot.Street.Model.Street;
import com.sofftech.softtechspringboot.Street.Service.EntityService.StreetEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StreetService {

    private final StreetEntityService streetEntityService;

    public List<StreetDto> findAll(){
        List<Street> streetList = streetEntityService.findAll();
        List<StreetDto> streetDtoList = StreetMapperConverter.INSTANCE.convertToStreetDtoList(streetList);

        return streetDtoList;
    }

    public StreetDto addStreet(StreetDto streetDto){
        Street street = StreetMapperConverter.INSTANCE.convertToStreetFromStreetDto(streetDto);
        street = streetEntityService.saveStreet(street);

        StreetDto streetDtoAfterAdding = StreetMapperConverter.INSTANCE.convertToStreetDtoFromStreet(street);
        return streetDtoAfterAdding;
    }

    public StreetDto update(StreetDto streetDto) throws Exception {
        Long id = streetDto.getId();
        boolean isExist = streetEntityService.existById(id);

        Street streetUpdate;
        if(isExist){
            streetUpdate = StreetMapperConverter.INSTANCE.convertToStreetFromStreetDto(streetDto);
            streetEntityService.saveStreet(streetUpdate);
        }else{
            throw new Exception("Street couldn't be found!");
        }

        StreetDto streetDtoUpdate = StreetMapperConverter.INSTANCE.convertToStreetDtoFromStreet(streetUpdate);
        return streetDtoUpdate;
    }
}
