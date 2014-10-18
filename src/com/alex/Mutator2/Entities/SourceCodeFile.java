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
public class SourceCodeFile {

	@Id
	@GeneratedValue
	private int sourceCodeFileId;

	@Column(length = 250)
	private String className;

	@Column(length = 1000)
	private String packageName;

	@Column(length = 1000)
	private String path;

	private String vcsVersion;

	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project project;

	private boolean isTestFile;
	
	@OneToMany(mappedBy = "sourceCodeFileId")
	private List<Mutation> mutations;
	
	@OneToMany(mappedBy = "sourceCodeFileId")
	private List<TestMethod> testMethods;
	
	{
		mutations = new ArrayList<>();
		testMethods = new ArrayList<>();
	}
}
