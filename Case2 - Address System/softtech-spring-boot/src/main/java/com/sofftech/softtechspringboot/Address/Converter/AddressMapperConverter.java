package com.sofftech.softtechspringboot.Address.Converter;

import com.sofftech.softtechspringboot.Address.Dto.AddressDto;
import com.sofftech.softtechspringboot.Address.Model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapperConverter {

    AddressMapperConverter INSTANCE = Mappers.getMapper(AddressMapperConverter.class);
    AddressDto convertToAddressDtoFromAddress(Address address);
    List<AddressDto> convertToAddressDtoList(List<Address> addressList);
    Address convertToAddressFromAddressDto(AddressDto addressDto);

}
