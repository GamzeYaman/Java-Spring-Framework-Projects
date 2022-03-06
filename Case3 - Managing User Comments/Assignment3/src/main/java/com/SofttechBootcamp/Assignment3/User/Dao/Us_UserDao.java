package com.SofttechBootcamp.Assignment3.User.Dao;

import com.SofttechBootcamp.Assignment3.User.Model.Us_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Us_UserDao extends JpaRepository<Us_User, Long> {

    Optional<Us_User> findById(Long id);
    Optional<Us_User> findByUserName(String userName);

    void deleteByUserNameAndUserPhoneNumber(String username, String phoneNumber);
}
