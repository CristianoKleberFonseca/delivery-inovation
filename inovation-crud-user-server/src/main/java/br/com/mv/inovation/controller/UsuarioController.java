package br.com.mv.inovation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mv.inovation.model.Usuario;
import br.com.mv.inovation.service.UsuarioService;

@RestController
@RequestMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Usuario> save(@RequestBody  Usuario usuario){
        return ResponseEntity.ok(this.usuarioService.save(usuario));
    }
	
	@RequestMapping(value = "/{login}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findById(@PathVariable("login") String id){
        return ResponseEntity.ok(this.usuarioService.findById(id));
    }
}
