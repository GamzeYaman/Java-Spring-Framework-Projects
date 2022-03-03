package com.sofftech.softtechspringboot.Neighborhood.Service.EntityService;

import com.sofftech.softtechspringboot.Neighborhood.Dao.NeighborhoodDao;
import com.sofftech.softtechspringboot.Neighborhood.Model.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NeighborhoodEntityService  {


   private final NeighborhoodDao neighborhoodDao;

    public List<Neighborhood> findAll(){
        return neighborhoodDao.findAll();
    }

    public Neighborhood saveNeighborhood(Neighborhood neighborhood){
        return neighborhoodDao.save(neighborhood);
    }

    public boolean existById(Long Id){
        return neighborhoodDao.existsById(Id);
    }
}
