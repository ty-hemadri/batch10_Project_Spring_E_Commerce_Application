package com.te.springecommerce.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "item")
@Entity
public class ItemBean implements Serializable{
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer qty;
	@Column
	private Double price;

}
