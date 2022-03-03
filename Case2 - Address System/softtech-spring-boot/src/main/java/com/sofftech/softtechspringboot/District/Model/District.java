package com.sofftech.softtechspringboot.District.Model;

import com.sofftech.softtechspringboot.City.Model.City;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "DISTRICT")
@Data
public class District {

    @Id
    @SequenceGenerator(name = "District", sequenceName = "DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "District")
    private Long Id;

    @Column(name = "DISTRICT_NAME", length = 100)
    private String districtName;

    @ManyToOne
    @JoinColumn(name = "CITY_ID")
    private City city;



}
