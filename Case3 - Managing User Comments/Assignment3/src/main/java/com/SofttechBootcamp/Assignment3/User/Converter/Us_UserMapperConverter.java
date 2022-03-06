package com.SofttechBootcamp.Assignment3.User.Converter;

import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserDto;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserSaveDto;
import com.SofttechBootcamp.Assignment3.User.Model.Us_User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Us_UserMapperConverter {

    Us_UserMapperConverter INSTANCE = Mappers.getMapper(Us_UserMapperConverter.class);
    Us_User convertToUsUserFromUsUserDto(Us_UserSaveDto usUserSaveDto);
    Us_User convertToUsUserFromUsUserDto(Us_UserDto usUserDto);
    Us_UserDto convertToUsUserDtoFromUsUser(Us_User usUser);
    List<Us_UserDto> convertToUsUserDtoList(List<Us_User> usUserList);
    Us_UserSaveDto convertToUsUserSaveDtoFromUsUserDto(Us_UserDto usUserDto);
}
