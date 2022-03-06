package com.SofttechBootcamp.Assignment3.User.Service;

import com.SofttechBootcamp.Assignment3.User.Converter.Us_UserMapperConverter;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserDeleteDto;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserDto;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserSaveDto;
import com.SofttechBootcamp.Assignment3.User.Model.Us_User;
import com.SofttechBootcamp.Assignment3.User.Service.EntityService.Us_UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Us_UserService {

    private final Us_UserEntityService usUserEntityService;

    public Us_UserDto saveUser(Us_UserSaveDto usUserSaveDto){
        Us_User usUser = Us_UserMapperConverter.INSTANCE.convertToUsUserFromUsUserDto(usUserSaveDto);
        usUser = usUserEntityService.save(usUser);

        Us_UserDto usUserDtoSave = Us_UserMapperConverter.INSTANCE.convertToUsUserDtoFromUsUser(usUser);
        return usUserDtoSave;
    }

    public List<Us_UserDto> findAllUsers(){
        List<Us_User> usUserList = usUserEntityService.findALl();
        List<Us_UserDto> usUserDtoList = Us_UserMapperConverter.INSTANCE.convertToUsUserDtoList(usUserList);
        return usUserDtoList;
    }

    public Us_UserDto getUserWithId(Long id){
        Us_User usUser = usUserEntityService.getIdWithControl(id);
        Us_UserDto usUserDto = Us_UserMapperConverter.INSTANCE.convertToUsUserDtoFromUsUser(usUser);
        return usUserDto;
    }


    public Us_UserDto getUserWithName(String name){
        Optional<Us_User> us_userOptional = usUserEntityService.findByName(name);

        Us_User usUser;
        if(us_userOptional.isPresent()){
            usUser = us_userOptional.get();
        }else{
            throw new RuntimeException("User who has this name cannot found!");
        }

        Us_UserDto usUserDto = Us_UserMapperConverter.INSTANCE.convertToUsUserDtoFromUsUser(usUser);
        return usUserDto;
    }

    /* While deleting a user, username and its phone number must be combined for completing deleting process */
    public void delete(Us_UserDeleteDto us_userDeleteDto) {
        Us_User user = usUserEntityService.getIdWithControl(us_userDeleteDto.getId());

        if( user.getUserPhoneNumber().equals(us_userDeleteDto.getUserPhoneNumber())
                && user.getUserName().equals(us_userDeleteDto.getUserName()) ){
            usUserEntityService.delete(user);
        }else{
            throw new RuntimeException("Couldn't be combined with " + us_userDeleteDto.getUserName() + " username and "
            + us_userDeleteDto.getUserPhoneNumber() + " phone number!");
        }

    }

    public Us_UserDto updateUser(Us_UserDto usUserDto){
        Long id = usUserDto.getId();
        Boolean isExist = usUserEntityService.existById(id);

        Us_User usUser;
        if(isExist){
            usUser = Us_UserMapperConverter.INSTANCE.convertToUsUserFromUsUserDto(usUserDto);
            usUser = usUserEntityService.save(usUser);
        }else{
            throw new RuntimeException("User not found!");
        }

        Us_UserDto usUserDtoUpdate = Us_UserMapperConverter.INSTANCE.convertToUsUserDtoFromUsUser(usUser);
        return usUserDtoUpdate;
    }
}
