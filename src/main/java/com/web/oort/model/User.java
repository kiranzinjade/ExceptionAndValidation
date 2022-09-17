package com.web.oort.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer uid;
	@NotNull(message = "username should not be Null")
	private String uname;
	@Email
	private String email;
	@NotNull
//	@Pattern(regexp = "/^([+]\\d{2})?\\d{10}$/")
	private String mobile;
	@NotNull(message = "Age can not be Null")
	@Min(18)
	@Max(70)
	private Integer age;
	@NotBlank
	private String nationality;

}
