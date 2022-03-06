package com.SofttechBootcamp.Assignment3.User.Dto;

import com.SofttechBootcamp.Assignment3.Gen.Enums.UserTypes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Us_UserSaveDto {
    private String userName;
    private String userEmail;
    private String userPhoneNumber;
    private UserTypes userType;
}
