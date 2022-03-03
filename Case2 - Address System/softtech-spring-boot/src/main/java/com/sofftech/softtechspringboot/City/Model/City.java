package com.sofftech.softtechspringboot.City.Model;


import com.sofftech.softtechspringboot.Country.Model.Country;
import com.sofftech.softtechspringboot.District.Model.District;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CITY")
@Data
public class City {

    @Id
    @SequenceGenerator(name = "City", sequenceName = "CITY_ID_SEC")
    @GeneratedValue(generator = "City")
    private int Id;

    @Column(name = "COUNTRY_ID")
    private int countryId;

    @Column(name = "CITY_NAME", length = 50)
    private String cityName;

    @Column(name = "PLAQUE", length = 20)
    private String plaque;




    /*@ManyToOne
    */


    /*(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
            optional = false
    )
    @JoinColumn(
            name = "COUNTRY_ID",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_CITY_COUNTRY")
    )
    @JsonIgnoreProperties(
            value = {"applications", "hibernateLazyInitializer"}
    )*/
    //private Country country;

}
