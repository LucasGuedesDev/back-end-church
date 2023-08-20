package com.apichurch.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_igrejas")
public class Church {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCongregation;
    private String sector;
    private String regional;
    private String cnpj;
    private String cep;
    private String uf;
    private String address;
    private String neighborhood;
    private String city;
    private Boolean isRent;
}
