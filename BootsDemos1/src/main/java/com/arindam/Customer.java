package com.arindam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
@Value("C1")
private String cid;
@Value("AYAN")
private String cname;
@Value("232332")
private String cphno;
}
