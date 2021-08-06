package org.ddangelorb.jauthservice.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
	  @ApiModelProperty(position = 0)
	  private String username;
	  @ApiModelProperty(position = 1)
	  private String password;
}
