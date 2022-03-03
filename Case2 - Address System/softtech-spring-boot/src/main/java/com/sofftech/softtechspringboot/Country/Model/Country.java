package com.sofftech.softtechspringboot.Country.Model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "COUNTRY")
@Data
public class Country {

    @Id
    @SequenceGenerator(name = "Country", sequenceName = "COUNTRY_ID_SEQ")
    @GeneratedValue(generator = "Country")
    private int Id;

    @Column(name = "COUNTRY_NAME", length = 150, nullable = false)
    private String countryName;

    @Column(name = "COUNTRY_CODE", length = 20, nullable = false)
    private String countryCode;




}
