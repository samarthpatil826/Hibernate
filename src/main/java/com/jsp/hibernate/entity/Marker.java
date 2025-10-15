package com.jsp.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marker_data")
public class Marker {

	@Id
	@Column(name="m_id")
	private int id;
	@Column(name="m_color")
	private String color;
	@Column(name="m_price")
	private double price;
	
	
	public Marker() {
		
	}
	
	public Marker(int id, String color, double price) {
		super();
		this.id = id;
		this.color = color;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String color) {
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Marker [id=" + id + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
