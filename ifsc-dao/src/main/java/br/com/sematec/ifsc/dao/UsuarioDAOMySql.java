package br.com.sematec.ifsc.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.sematec.ifsc.infra.DAO;
import br.com.sematec.ifsc.interfaces.IUsuarioDAO;
import br.com.sematec.ifsc.util.JPAUtil;
import br.com.sematec.modelo.Usuario;

class UsuarioDAOMySql extends DAO<Usuario> implements IUsuarioDAO {
	private static final long serialVersionUID = 1L;

	@Override
	public Usuario buscaPorEmailESenha(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscaUsuarioPorLoginESenha(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Usuario usuario) {
		EntityManager em = new JPAUtil().getEntityManager();
		TypedQuery<Usuario> query = em.createQuery(" select u from Usuario u " + " where u.email = :pEmail and u.senha = :pSenha", Usuario.class);
		query.setParameter("pEmail", usuario.getEmail());
		query.setParameter("pSenha", usuario.getSenha());
		try {
			query.getSingleResult();
		} catch (NoResultException ex) {
			return false;
		}
		em.close();
		return true;
	}

	@PostConstruct
	public void init() {
		classe = Usuario.class;
	}
}
