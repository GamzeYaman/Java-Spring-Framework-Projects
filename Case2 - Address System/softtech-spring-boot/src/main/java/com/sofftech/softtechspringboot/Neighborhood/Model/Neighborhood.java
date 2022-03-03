package com.sofftech.softtechspringboot.Neighborhood.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "NEIGHBORHOOD2")
@Data
public class Neighborhood {

    @Id
    @SequenceGenerator(name = "Neighborhood2", sequenceName = "NEIGHBORHOOD2_ID_SEQ")
    @GeneratedValue(generator = "Neighborhood2")
    private Long Id;

    @Column(name = "NEIGHBORHOOD_NAME", length = 100)
    private String neighborhoodName;
}
