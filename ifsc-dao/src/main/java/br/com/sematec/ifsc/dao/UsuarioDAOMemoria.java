package br.com.sematec.ifsc.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.sematec.ifsc.infra.DAO;
import br.com.sematec.ifsc.interfaces.IUsuarioDAO;
import br.com.sematec.modelo.Usuario;

class UsuarioDAOMemoria extends DAO<Usuario> implements IUsuarioDAO {

	private static final long serialVersionUID = 1L;
	private final static Map<String, Usuario> USUARIOS = new HashMap<>();
	static {
		USUARIOS.put("professor@sematecsolucoes.com.br", new Usuario("professor@sematecsolucoes.com.br", "professor"));
		USUARIOS.put("diretor@sematecsolucoes.com.br", new Usuario("diretor@sematecsolucoes.com.br", "diretor"));
		USUARIOS.put("teste@teste.com", new Usuario("teste@teste.com", "teste"));
	}

	@Override
	public Usuario buscaPorEmailESenha(String email, String senha) {
		if (!USUARIOS.containsKey(email)) {
			return null;
		}
		Usuario usuario = USUARIOS.get(email);
		if (usuario.getSenha().equals(senha)) {
			return usuario;
		}
		return null;
	}

	@Override
	public Usuario buscaUsuarioPorLoginESenha(Usuario usuario) {
		if (!USUARIOS.containsKey(usuario.getLogin())) {
			return null;
		}
		String login = usuario.getLogin();
		String senha = usuario.getSenha();
		usuario = USUARIOS.get(login);
		if (usuario.getSenha().equals(senha)) {
			return usuario;
		}
		return null;
	}

	@Override
	public boolean existe(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
}
