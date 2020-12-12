package br.com.jwt.template.api.usuario.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jwt.template.api.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	boolean existsByUsername(String username);

	Usuario findByUsername(String username);

	@Transactional
	void deleteByUsername(String username);

}