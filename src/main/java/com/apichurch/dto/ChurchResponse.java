package com.apichurch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChurchResponse {
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
