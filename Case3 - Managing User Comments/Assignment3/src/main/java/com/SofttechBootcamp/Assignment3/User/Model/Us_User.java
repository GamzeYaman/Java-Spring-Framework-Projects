package com.SofttechBootcamp.Assignment3.User.Model;


import com.SofttechBootcamp.Assignment3.Gen.Enums.UserTypes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "US_USER")
@Getter
@Setter
public class Us_User {

    @Id
    @SequenceGenerator(name = "Us_User", sequenceName = "US_USER_ID_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "Us_User")
    private long Id;

    @Column(name = "USER_NAME", length = 100, nullable = false)
    private String userName;

    @Column(name = "USER_EMAIL", length = 100, nullable = false)
    private String userEmail;

    @Column(name = "USER_PHONE_NUMBER", length = 11, nullable = false)
    private String userPhoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_TYPE", length = 30, nullable = false)
    private UserTypes userType;


}
