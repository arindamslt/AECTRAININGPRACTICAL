package com.arindam;

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
@Table(name="EMPLOYEE_MASTER")
public class Employee {
	@Id
	@GeneratedValue
private Integer eid;
	@Column(length = 25,nullable = false)
private String ename;
private Double sal;
@Column(name="desig",length = 25)
private String esdesig;
@Temporal(TemporalType.DATE)
private Date joindt;
@Temporal(TemporalType.TIMESTAMP)
private Date workhr;
@Column(length = 30)
private String email;
}
