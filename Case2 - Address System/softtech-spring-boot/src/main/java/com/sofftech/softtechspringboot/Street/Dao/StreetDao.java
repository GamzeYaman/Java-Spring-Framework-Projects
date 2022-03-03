package com.sofftech.softtechspringboot.Street.Dao;

import com.sofftech.softtechspringboot.Street.Model.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetDao extends JpaRepository<Street, Long> {

}
