package com.apichurch.dto;

import com.apichurch.entities.Church;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponse {
    private String name;
    private String office;
    private Date consecrationDate;
    private Date dateBirth;
    private String naturalness;
    private String uf;
    private String sex;
    private String cep;
    private String address;
    private String neighborhood;
    private String city;
    private String foneRes;
    private String foneCel;
    private String email;
    private String maritalStatus;
    private Date dateWedding;
    private String profession;
    private String cpf;
    private String rg;
    private String baptizedHe;
    private Date dateBaptizedHe;
    private Date dateBaptized;
    private Church church;
    private Date dateAdmission;
    private String nameSpouse;
    private String children;
    private Date dateConversion;
    private String churchOrigin;
    private String churchOriginCity;
    private String churchOrigiNCity_uf;
    private Integer amountSon;
}
