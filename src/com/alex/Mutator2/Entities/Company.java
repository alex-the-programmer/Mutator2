package com.alex.Mutator2.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

	@OneToMany(mappedBy = "companyId")
	private List<Project> projects;

	@OneToMany(mappedBy = "companyId")
	private List<User> users;

	{
		projects = new ArrayList<>();
		users = new ArrayList<>();
	}
}
