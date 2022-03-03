package com.sofftech.softtechspringboot.Street.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "STREET")
@Data
public class Street {

    @Id
    @SequenceGenerator(name = "Street", sequenceName = "STREET_ID_SEQ")
    @GeneratedValue(generator = "Street")
    private Long Id;

    @Column(name = "STREET_NAME", length = 100, nullable = false)
    private String streetName;


}
