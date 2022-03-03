package com.sofftech.softtechspringboot.Neighborhood.Dao;

import com.sofftech.softtechspringboot.Neighborhood.Model.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodDao extends JpaRepository<Neighborhood, Long> {
}
