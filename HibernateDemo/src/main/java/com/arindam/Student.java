package com.arindam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
private Integer rollno;
	@Column(length = 25)
private String sname;
	@OneToOne
	@JoinColumn(name="T_ID")
private Teacher tr;

}
