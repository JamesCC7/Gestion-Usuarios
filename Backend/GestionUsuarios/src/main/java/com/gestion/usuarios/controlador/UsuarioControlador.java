 package com.gestion.usuarios.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.usuarios.modelo.Usuario;
import com.gestion.usuarios.repositorio.UsuarioRepositorio;

@RestController
@RequestMapping("/api/v1/")
public class UsuarioControlador {

	@Autowired
	private UsuarioRepositorio repositorio;
	
	@GetMapping("/usuarios")
	public List<Usuario> listarTodosLosUsuarios(){
		return repositorio.findAll();
	}
	
	@GetMapping("/usuarios")
	public Usuario obtenerUsuario(Long id){
		return repositorio.findById(id).get();
	}
}
