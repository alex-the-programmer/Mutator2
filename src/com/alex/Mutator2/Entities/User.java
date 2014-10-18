package com.alex.Mutator2.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue
	private int userId;

	@Column(length = 50)
	private String login;

	@Column(length = 50)
	private String password;

	@Column(length = 50)
	private String firstName;

	@Column(length = 50)
	private String lastName;

	@Column(length = 50)
	private String email;

	@ManyToOne
	@JoinColumn(name = "companyId")
	private Company company;
}
