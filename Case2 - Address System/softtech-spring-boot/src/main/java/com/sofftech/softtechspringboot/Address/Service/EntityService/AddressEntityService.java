package com.sofftech.softtechspringboot.Address.Service.EntityService;


import com.sofftech.softtechspringboot.Address.Dao.AddressDao;
import com.sofftech.softtechspringboot.Address.Model.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressEntityService /*extends BaseEntityService<Address, AddressDao>*/ {
    /*public AddressEntityService(AddressDao dao) {
        super(dao);
    }*/

   private final AddressDao addressDao;

    //listeledim verileri
    public List<Address> findAll(){
        return addressDao.findAll();
    }

    //kaydettim dataları
    public Address saveAddress(Address address){
        return addressDao.save(address);
    }
}
