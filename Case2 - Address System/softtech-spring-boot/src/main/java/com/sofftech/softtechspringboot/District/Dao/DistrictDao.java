package com.sofftech.softtechspringboot.District.Dao;

import com.sofftech.softtechspringboot.District.Model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictDao extends JpaRepository<District, Long> {
}
