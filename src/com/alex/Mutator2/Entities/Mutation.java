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
public class Mutation {

	@Id
	@GeneratedValue
	private int mutationId;

	@Column(length = 250)
	private String javaMutationOperatorClass;

	private int startPosition;

	private int length;

	@Column(nullable = true)
	private String mutatedFileCode;

	@Column(nullable = true)
	private byte[] mutatedBuiltClass;

	@ManyToOne
	@JoinColumn(name = "sourceCodeFileId")
	private SourceCodeFile sourceCodeFile;

	@OneToMany(mappedBy = "mutationId")
	private List<Revealance> revealances;

	{
		revealances = new ArrayList<>();
	}
}
