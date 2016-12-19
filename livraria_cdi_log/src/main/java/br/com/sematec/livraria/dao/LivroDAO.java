package br.com.sematec.livraria.dao;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

import br.com.sematec.ifsc.infra.DAO;
import br.com.sematec.modelo.Livro;

@RequestScoped
public class LivroDAO extends DAO<Livro> {
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		classe = Livro.class;
	}

}
