package br.com.sematec.ifsc.dao;

import br.com.sematec.ifsc.interfaces.IUsuarioDAO;

public class UsuarioDAOFactory {
	public static IUsuarioDAO getInstance(DAOFactory type) {
		switch (type) {

		case MEMORIA:
			if (usuarioDAOMemoria == null) {
				usuarioDAOMemoria = new UsuarioDAOMemoria();
			}
			return usuarioDAOMemoria;

		case MYSQL:
			if (usuarioDAOMySql == null) {
				usuarioDAOMySql = new UsuarioDAOMySql();
			}
			return usuarioDAOMySql;

		default:
			return null;
		}
	}

	static UsuarioDAOMemoria usuarioDAOMemoria;
	static UsuarioDAOMySql usuarioDAOMySql;

}
