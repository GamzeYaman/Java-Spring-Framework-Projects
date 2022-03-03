package com.sofftech.softtechspringboot;

import com.sofftech.softtechspringboot.Address.Dto.AddressDto;
import com.sofftech.softtechspringboot.Address.Service.AddressService;
import com.sofftech.softtechspringboot.City.Dto.CityDto;
import com.sofftech.softtechspringboot.City.Service.CityService;
import com.sofftech.softtechspringboot.Country.Dto.CountryDto;
import com.sofftech.softtechspringboot.Country.Service.CountryService;
import com.sofftech.softtechspringboot.District.Dto.DistrictDto;
import com.sofftech.softtechspringboot.District.Service.DistrictService;
import com.sofftech.softtechspringboot.Neighborhood.Dto.NeighborhoodDto;
import com.sofftech.softtechspringboot.Neighborhood.Service.NeighborhoodService;
import com.sofftech.softtechspringboot.Street.Dto.StreetDto;
import com.sofftech.softtechspringboot.Street.Service.StreetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class Controller {

    private final CountryService countryService;
    private final CityService cityService;
    private final DistrictService districtService;
    private final StreetService streetService;
    private final AddressService addressService;
    private final NeighborhoodService neighborhoodService;


    //COUNTRY
    @GetMapping("/country/{countryCode}")
    public ResponseEntity findAllCountries(@PathVariable String countryCode){
        List<CountryDto> countryDtoList = countryService.findAll();
        return new ResponseEntity(countryDtoList, HttpStatus.OK);
    }

    @PostMapping("/country")
    public ResponseEntity saveCountry(@RequestBody CountryDto countryDto){
        CountryDto countryDtoSave = countryService.addCountry(countryDto);
        return new ResponseEntity(countryDtoSave, HttpStatus.OK);
    }

    //CITY
   @GetMapping("/cities/{plaque}")
    public ResponseEntity findAllCities(@PathVariable String plaque){
        List<CityDto> cityDtoList = cityService.findAll();
        return new ResponseEntity(cityDtoList, HttpStatus.OK);
    }

    @PostMapping("/city")
    public ResponseEntity saveCity(@RequestBody CityDto cityDto){
        CityDto cityDtoSave = cityService.addCity(cityDto);
        return new ResponseEntity(cityDtoSave, HttpStatus.OK);
    }

    //DISTRICT
   @GetMapping("/districts/{Id}")
    public ResponseEntity findAllDistricts(@PathVariable Long Id){
        List<DistrictDto> districtDtoList = districtService.findAll();
        return new ResponseEntity(districtDtoList, HttpStatus.OK);
    }

    @PostMapping("/district")
    public ResponseEntity saveDistrict(@RequestBody DistrictDto districtDto){
        DistrictDto districtDtoSave = districtService.addDistrict(districtDto);
        return new ResponseEntity(districtDtoSave, HttpStatus.OK);
    }

    //NEIGHBORHOOD
   @GetMapping("/neighborhoods")
    public ResponseEntity findAllNeighborhoods(){
        List<NeighborhoodDto> neighborhoodDtoList = neighborhoodService.findAll();
        return new ResponseEntity(neighborhoodDtoList, HttpStatus.OK);
    }

    @PostMapping("/neighborhood")
    public ResponseEntity saveNeighborhood(@RequestBody NeighborhoodDto neighborhoodDto){
        NeighborhoodDto neighborhoodDtoSave = neighborhoodService.addNeighborhood(neighborhoodDto);
        return new ResponseEntity(neighborhoodDtoSave, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateNeighborhoodName(@RequestBody NeighborhoodDto neighborhoodDto) throws Exception {
        NeighborhoodDto neighborhoodDtoUpdate = neighborhoodService.update(neighborhoodDto);
        return new ResponseEntity(neighborhoodDtoUpdate, HttpStatus.OK);
    }

    //STREET
    @GetMapping("/streets")
    public ResponseEntity findAllStreets(){
        List<StreetDto> streetDtoList = streetService.findAll();
        return new ResponseEntity(streetDtoList, HttpStatus.OK);
    }

    @PostMapping("/street")
    public ResponseEntity saveStreet(@RequestBody StreetDto streetDto){
        StreetDto streetDtoSave = streetService.addStreet(streetDto);
        return new ResponseEntity(streetDtoSave, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity updateStreetName(@RequestBody StreetDto streetDto) throws Exception {
        StreetDto streetDtoUpdate = streetService.update(streetDto);
        return new ResponseEntity(streetDtoUpdate, HttpStatus.OK);
    }

    //ADDRESS
   @GetMapping("/adresses")
    public ResponseEntity findAllAddresses(){
        List<AddressDto> addressDtoList = addressService.findAll();
        return new ResponseEntity(addressDtoList, HttpStatus.OK);
    }

    @PostMapping("/adress")
    public ResponseEntity saveAddress(@RequestBody AddressDto addressDto){
        AddressDto addressDtoSave = addressService.addAddress(addressDto);
        return new ResponseEntity(addressDtoSave, HttpStatus.OK);
    }



}
