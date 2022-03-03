package com.sofftech.softtechspringboot.Address.Model;

import com.sofftech.softtechspringboot.City.Model.City;
import com.sofftech.softtechspringboot.Country.Model.Country;
import com.sofftech.softtechspringboot.District.Model.District;
import com.sofftech.softtechspringboot.Neighborhood.Model.Neighborhood;
import com.sofftech.softtechspringboot.Street.Model.Street;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="ADDRESS")
@Data
public class Address {

    @Id
    @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ")
    @GeneratedValue(generator = "Address")
    private Long Id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "NEIGHBORHOOD_ID",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_NEIGHBORHOOD_DISTRICT")
    )
    private Neighborhood neighborhoodId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "STREET_ID",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_STREET_NEIGHBORHOOD")
    )
    private Street streetId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "DISTRICT_ID",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_DISTRICT_CITY")
    )
    private District districtId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "CITY_ID",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_CITY_COUNTRY")
    )
    private City cityId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name = "COUNTRY_ID",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_ADDRESS_COUNTRY")
    )
    private Country countryId;
}
