package com.web.oort.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName ="build")
@NoArgsConstructor
public class UserRequest {

	private String uname;
	private String email;
	private String mobile;
	private Integer age;
	private String nationality;
	
}
