package com.arindam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component(value="emp")
public class Employee {
	@Value("C1")
private String eid;
	@Value("AYAN")
private String ename;
	@Value("MANAGER")
private String desig;
	@Value("IT")
private String deptnm;

}
