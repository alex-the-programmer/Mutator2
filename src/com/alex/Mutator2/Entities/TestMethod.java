package com.alex.Mutator2.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class TestMethod {

	@Id
	@GeneratedValue
	private int testMethodId;

	@Column(length = 250)
	private String name;

	@Column(nullable = true)
	private long lastElapsionTime;

	@Column(nullable = true)
	private double comprehension;

	@ManyToOne
	@JoinColumn(name = "sourceCodeFileId")
	private SourceCodeFile sourceCodeFile;

	@OneToMany(mappedBy = "testMethodId")
	private List<Revealance> revealances;

	{
		revealances = new ArrayList<>();
	}
}
