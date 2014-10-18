package com.alex.Mutator2.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Project {

	@Id
	@GeneratedValue
	private int projectId;

	@Column(length = 100)
	private String name;

	@ManyToOne
	@JoinColumn(name = "companyId")
	Company company;

	@OneToOne(mappedBy = "vcsId")
	private Vcs vcs;
}
