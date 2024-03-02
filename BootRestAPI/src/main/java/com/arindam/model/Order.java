package com.arindam.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="order_dtls")
public class Order {
	@Id
	@GeneratedValue
private Integer orderid;
private Integer iqty;
@CreationTimestamp
@Temporal(TemporalType.DATE)
private Date orderdt;
@Column(length = 25)
private String oitem;
private Double price;
}
