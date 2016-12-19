package br.com.sematec.ifsc.interfaces;

import br.com.sematec.modelo.Usuario;

public interface IUsuarioDAO {

	Usuario buscaPorEmailESenha(String email, String senha);

	Usuario buscaUsuarioPorLoginESenha(Usuario usuario);

	boolean existe(Usuario usuario);

}
