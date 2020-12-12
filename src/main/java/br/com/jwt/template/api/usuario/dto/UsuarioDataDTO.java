package br.com.jwt.template.api.usuario.dto;

import java.util.List;

import br.com.jwt.template.core.security.enums.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UsuarioDataDTO {
  
	@ApiModelProperty(position = 0)
	private String username;
	
	@ApiModelProperty(position = 1)
	private String email;
	
	@ApiModelProperty(position = 2)
	private String password;
	
	@ApiModelProperty(position = 3)
	List<Role> roles;
}