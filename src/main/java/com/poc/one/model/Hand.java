package com.poc.one.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hands")
public class Hand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "card1")
	private String card1;


	@Column(name = "card2")
	private String card2;
	
	public Hand() {};
	
	public Hand(Integer a, String b, String c) {
		id = a;
		card1 = b;
		card2 = c;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getCard1() {
		return card1;
	}

	public String getCard2() {
		return card2;
	}

	public void setCard1(String card1) {
		this.card1 = card1;
	}

	public void setCard2(String card2) {
		this.card2 = card2;
	}
	
}
