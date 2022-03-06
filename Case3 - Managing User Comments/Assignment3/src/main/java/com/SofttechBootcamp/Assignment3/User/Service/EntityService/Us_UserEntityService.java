package com.SofttechBootcamp.Assignment3.User.Service.EntityService;

import com.SofttechBootcamp.Assignment3.User.Dao.Us_UserDao;
import com.SofttechBootcamp.Assignment3.User.Dto.Us_UserDeleteDto;
import com.SofttechBootcamp.Assignment3.User.Model.Us_User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Us_UserEntityService {

    private final Us_UserDao usUserDao;

    //post
    public Us_User save(Us_User usUser){
        return usUserDao.save(usUser);
    }

    //get
    public List<Us_User> findALl(){
        return usUserDao.findAll();
    }

    // get with ıd
    public Optional<Us_User> findById(Long id){
        return usUserDao.findById(id);
    }

    //get with name
    public Optional<Us_User> findByName(String name){
        return usUserDao.findByUserName(name);
    }

    public boolean existById(Long id){
        return usUserDao.existsById(id);
    }

    public void delete(Us_User usUser){
        usUserDao.delete(usUser);
    }

    public Us_User getIdWithControl(Long id){
        Optional<Us_User> us_userOptional = findById(id);;

        Us_User usUser;
        if(us_userOptional.isPresent()){
            usUser = us_userOptional.get();
        }else{
            throw new RuntimeException("User cannot found!");
        }

        return usUser;
    }
}
