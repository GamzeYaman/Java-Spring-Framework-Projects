package com.sofftech.softtechspringboot.Country.Service.EntityService;

import com.sofftech.softtechspringboot.Country.Dao.CountryDao;
import com.sofftech.softtechspringboot.Country.Model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryEntityService  {

    private final CountryDao countryDao;

    public List<Country> findAll(){
        return countryDao.findAll();
    }

    public Country saveCountry(Country country){
        return countryDao.save(country);
    }


}
