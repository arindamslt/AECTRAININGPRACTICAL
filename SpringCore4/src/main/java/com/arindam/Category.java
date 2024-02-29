package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component(value="cg")
public class Category {
	@Value("PROGRAMMING LANGUAGE")
private String catgnm;
@Autowired //Link between the objects
private Book bk;//object reference
}
