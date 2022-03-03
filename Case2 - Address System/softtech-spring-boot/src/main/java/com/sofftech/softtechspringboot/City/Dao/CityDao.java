package com.sofftech.softtechspringboot.City.Dao;

import com.sofftech.softtechspringboot.City.Model.City;
import com.sofftech.softtechspringboot.Country.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityDao extends JpaRepository<City, Integer> {



    //public List<City> findByCountryName(String countryName);
}
