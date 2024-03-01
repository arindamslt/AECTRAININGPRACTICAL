package com.arindam;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.db")
public class DbConn {
	private String driver;
	private String url;
	private String uname;
	private String pass;
}
