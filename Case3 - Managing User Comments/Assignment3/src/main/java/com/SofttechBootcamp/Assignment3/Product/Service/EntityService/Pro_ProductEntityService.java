package com.SofttechBootcamp.Assignment3.Product.Service.EntityService;

import com.SofttechBootcamp.Assignment3.Product.Dao.Pro_ProductDao;
import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductDto;
import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductSaveDto;
import com.SofttechBootcamp.Assignment3.Product.Model.Pro_Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Pro_ProductEntityService {

    private final Pro_ProductDao proProductDao;

    public Pro_Product save(Pro_Product proProduct){
        return proProductDao.save(proProduct);
    }

    public List<Pro_Product> findAll(){
        return proProductDao.findAll();
    }

    public Optional<Pro_Product>  findById(Long id){
        return proProductDao.findById(id);
    }

    public Pro_Product update(Long id, BigDecimal price){
        Pro_Product proProduct = getIdWithControl(id);
        proProduct.setProductPrice(price);
        return proProductDao.save(proProduct);
    }

    public void delete(Long id){
        Pro_Product proProduct = getIdWithControl(id);
        proProductDao.delete(proProduct);
    }

    public Pro_Product getIdWithControl(Long id){
        Optional<Pro_Product> proProductOptional = proProductDao.findById(id);

        Pro_Product proProduct;
        if(proProductOptional.isPresent()){
            proProduct = proProductOptional.get();
        }else{
            throw new RuntimeException("Product cannot found!");
        }

        return proProduct;
    }


}

