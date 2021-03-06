package com.web.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class LoginData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private @Getter @Setter int id;
	
	@NotBlank(message="Username can't be empty!")
	@Size(min = 3, max = 12, message="Username must be between 3-12 character!")
	private @Getter @Setter String userName;
	@NotBlank(message="Email can't be empty!")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid Email" )
	private @Getter @Setter String email;
	
	@AssertTrue(message="must agree!")
	private @Getter @Setter boolean agreed;

}
