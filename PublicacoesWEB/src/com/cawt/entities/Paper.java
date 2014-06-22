package com.cawt.entities;

public enum Paper {
	SHORT("Minimo"),
	FULL("Completo");

	private String label;

	Paper(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
