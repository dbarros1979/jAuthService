package org.ddangelorb.jauthservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;

	  @Column(unique = true, nullable = false)
	  private String email;

	  @Column(unique = true, nullable = false)
	  private String phone;

	  @Size(min = 8, message = "Minimum password length: 8 characters")
	  @Column(nullable = false)
	  private String password;
	  
	  @Size(min = 4, max = 255, message = "Minimum firstname length: 4 characters")
	  @Column(nullable = false)
	  private String firstname;

	  @Size(min = 4, max = 255, message = "Minimum surname length: 4 characters")
	  @Column(nullable = false)
	  private String surname;
	  
	  private String avatar;

	  @Column(nullable = false)
	  private Integer active;
	  
}
