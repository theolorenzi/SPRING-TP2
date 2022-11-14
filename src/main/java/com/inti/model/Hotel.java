package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
	@Id
	protected int numero;
	protected String numTel;
	protected String adresse;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel")
	private List<Salarie> lSalarie;

}
