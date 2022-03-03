package com.sofftech.softtechspringboot.City.Service.EntityService;

import com.sofftech.softtechspringboot.City.Dao.CityDao;
import com.sofftech.softtechspringboot.City.Model.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityEntityService  {


   private final CityDao cityDao;

    public List<City> findAll(){
        return cityDao.findAll();
    }

    public City saveCity(City city){
        return cityDao.save(city);
    }
}
