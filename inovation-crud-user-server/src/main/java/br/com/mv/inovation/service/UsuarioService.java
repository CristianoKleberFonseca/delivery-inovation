package br.com.mv.inovation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.mv.inovation.model.Usuario;
import br.com.mv.inovation.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario save(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}
	
	public Usuario findById(@Validated String id) {
		return this.usuarioRepository.findOne(id);
	}

}
