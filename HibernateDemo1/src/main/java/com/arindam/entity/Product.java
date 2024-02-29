package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prdt")
public class Product {
	@Id
	@Column(length = 10)
private String pid;
	@Column(length = 25)
private String pname;
private Integer pqty;
private Double price;
}
