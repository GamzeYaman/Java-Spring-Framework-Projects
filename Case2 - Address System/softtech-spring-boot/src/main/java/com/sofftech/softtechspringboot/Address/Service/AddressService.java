package com.sofftech.softtechspringboot.Address.Service;

import com.sofftech.softtechspringboot.Address.Converter.AddressMapperConverter;
import com.sofftech.softtechspringboot.Address.Dto.AddressDto;
import com.sofftech.softtechspringboot.Address.Model.Address;
import com.sofftech.softtechspringboot.Address.Service.EntityService.AddressEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {
   private final AddressEntityService addressEntityService;

    public List<AddressDto> findAll(){
        List<Address> addressList = addressEntityService.findAll();
        List<AddressDto> addressDtoList = AddressMapperConverter.INSTANCE.convertToAddressDtoList(addressList);
        return addressDtoList;
    }

    public AddressDto addAddress(AddressDto addressDto){
        Address address = AddressMapperConverter.INSTANCE.convertToAddressFromAddressDto(addressDto);
        address = addressEntityService.saveAddress(address);

        AddressDto addressDtoAfterAdding = AddressMapperConverter.INSTANCE.convertToAddressDtoFromAddress(address);
        return addressDtoAfterAdding;
    }
}
