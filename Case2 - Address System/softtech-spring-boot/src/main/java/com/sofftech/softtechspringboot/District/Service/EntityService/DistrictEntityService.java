package com.sofftech.softtechspringboot.District.Service.EntityService;

import com.sofftech.softtechspringboot.District.Dao.DistrictDao;
import com.sofftech.softtechspringboot.District.Model.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class DistrictEntityService  {

    private final DistrictDao districtDao;
    public List<District> findAll(){
        return districtDao.findAll();
    }

    public District saveDistrict(District district){
        return districtDao.save(district);
    }
}
