package com.sofftech.softtechspringboot.Country.Dao;


import com.sofftech.softtechspringboot.Country.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryDao extends JpaRepository<Country, Integer> {



    //Repositoryler interface olur ve entity yapılarını veritabanına kaydedilmesi için kullanılır
    // JPARepository java modeli ile veritabanı modeli arasında köprü oluşturur


}
