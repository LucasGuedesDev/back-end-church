package com.apichurch.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_membros")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "church_id")
	private Church church;
	private Date dateAdmission;
	private String nameSpouse;
	private String children;
	private Date dateConversion;
	private String churchOrigin;
	private String churchOriginCity;
	private String churchOrigiNCity_uf;

}
