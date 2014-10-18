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
	@JoinColumn(name = "SourceCodeFileId")
	private SourceCodeFile sourceCodeFile;
}
