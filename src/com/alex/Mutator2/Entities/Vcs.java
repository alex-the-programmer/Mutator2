package com.alex.Mutator2.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Vcs {

	@Id
	@GeneratedValue
	private int cvsId;

	private String name;

	@Column(length = 250)
	private String javaClassName;
}
