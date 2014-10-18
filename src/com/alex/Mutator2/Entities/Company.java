package com.alex.Mutator2.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Company {

	@Id
	@GeneratedValue
	private int companyId;

	@Column(length = 50)
	private String name;

	@Column(length = 50)
	private String email;
}
