package com.sofftech.softtechspringboot.Street.Service.EntityService;

import com.sofftech.softtechspringboot.Street.Dao.StreetDao;
import com.sofftech.softtechspringboot.Street.Model.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StreetEntityService  {

    private final StreetDao streetDao;

    public List<Street> findAll(){
        return streetDao.findAll();
    }

    public Street saveStreet(Street street){
        return streetDao.save(street);
    }

    public boolean existById(Long Id){
        return streetDao.existsById(Id);
    }
}
