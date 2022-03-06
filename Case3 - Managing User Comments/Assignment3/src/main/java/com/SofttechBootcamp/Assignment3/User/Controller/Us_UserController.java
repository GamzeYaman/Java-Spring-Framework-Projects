package com.SofttechBootcamp.Assignment3.User.Controller;


import com.SofttechBootcamp.Assignment3.Gen.Dto.RestResponse;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserDeleteDto;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserDto;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserSaveDto;
import com.SofttechBootcamp.Assignment3.User.Service.Us_UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class Us_UserController {

    private final Us_UserService usUserService;

    @PostMapping
    public ResponseEntity saveUsers(@RequestBody Us_UserSaveDto usUserSaveDto){
        Us_UserDto usUserDtoSave = usUserService.saveUser(usUserSaveDto);
        return ResponseEntity.ok(RestResponse.of(usUserDtoSave));
    }

    @GetMapping
    public ResponseEntity getAllUsers(){
        List<Us_UserDto> usUserDtoList =  usUserService.findAllUsers();
        return ResponseEntity.ok(RestResponse.of(usUserDtoList));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity getUsersWithId(@PathVariable Long id){
        Us_UserDto usUserDtoList = usUserService.getUserWithId(id);
        return ResponseEntity.ok(RestResponse.of(usUserDtoList));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity getUsersWithName(@PathVariable String name){
        Us_UserDto usUserDtoList = usUserService.getUserWithName(name);
        return ResponseEntity.ok(RestResponse.of(usUserDtoList));
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody Us_UserDto usUserDto){
        Us_UserDto usUserDtoUpdate = usUserService.updateUser(usUserDto);
        return ResponseEntity.ok(RestResponse.of(usUserDtoUpdate));
    }

    @DeleteMapping()
    public ResponseEntity deleteUser(@RequestBody Us_UserDeleteDto id){
        usUserService.delete(id);
        return ResponseEntity.ok(RestResponse.empty());
    }

}
