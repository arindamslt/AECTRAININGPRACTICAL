package com.arindam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PurchaseDetails {
	@Id
	@Column(length = 10)
private String icode;
	@Column(length = 25)
private String iname;
private Integer iqty;
private Double price;
}
