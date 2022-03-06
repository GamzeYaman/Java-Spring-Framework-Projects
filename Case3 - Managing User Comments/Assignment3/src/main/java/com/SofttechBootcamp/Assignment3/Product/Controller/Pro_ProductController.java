package com.SofttechBootcamp.Assignment3.Product.Controller;

import com.SofttechBootcamp.Assignment3.Gen.Dto.RestResponse;
import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductDto;
import com.SofttechBootcamp.Assignment3.Product.Dto.Pro_ProductSaveDto;
import com.SofttechBootcamp.Assignment3.Product.Model.Pro_Product;
import com.SofttechBootcamp.Assignment3.Product.Service.Pro_ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class Pro_ProductController {
    private final Pro_ProductService proProductService;

    @PostMapping
    public ResponseEntity saveProducts(@RequestBody Pro_ProductSaveDto proProductSaveDto){
       Pro_ProductDto proProductDtoSave = proProductService.saveProduct(proProductSaveDto);
       return ResponseEntity.ok(RestResponse.of(proProductDtoSave));
    }

    @GetMapping
    public ResponseEntity getAllProducts(){
      List<Pro_ProductDto> proProductDtoList = proProductService.findAllProducts();
      return ResponseEntity.ok(RestResponse.of(proProductDtoList));
    }

    @GetMapping("/{id}")
    public ResponseEntity getProductById(@PathVariable Long id){
        Pro_ProductDto proProductDtoOptional = proProductService.findById(id);
        return ResponseEntity.ok(RestResponse.of(proProductDtoOptional));
    }

    @PatchMapping
    public ResponseEntity updateProductPrice(@RequestParam Long id, @RequestParam BigDecimal price){
        Pro_ProductDto proProductDto = proProductService.updateProductPrice(id, price);
        return ResponseEntity.ok(RestResponse.of(proProductDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id){
        proProductService.deleteProduct(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
}
