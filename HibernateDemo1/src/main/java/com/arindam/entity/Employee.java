package com.arindam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="emp_info")
public class Employee {
	@Id
	@GeneratedValue
private Integer eid;
	@Column(length = 25,nullable = false)
private String ename;
	@Column(name="desig",length = 25)
private String edesig;
private Double sal;
@Temporal(TemporalType.DATE)
private Date joindt;
@Temporal(TemporalType.TIMESTAMP)
private Date workhr;
@Column(length = 30)
private String email;
}
