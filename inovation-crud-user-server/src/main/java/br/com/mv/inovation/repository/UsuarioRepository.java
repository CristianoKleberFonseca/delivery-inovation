package br.com.mv.inovation.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mv.inovation.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>  {

}
