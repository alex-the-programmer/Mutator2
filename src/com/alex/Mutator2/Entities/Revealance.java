package com.alex.Mutator2.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Revealance {

	@Id
	@ManyToOne
	@JoinColumn(name = "mutationId")
	private Mutation mutation;

	@Id
	@ManyToOne
	@JoinColumn(name = "testMethodId")
	private TestMethod testMethod;

	private boolean isRevealed;
}
