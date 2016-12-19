package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.sematec.modelo.Usuario;

@Component
public class UsuarioRepositoryImpl extends Repository<Usuario, Long> implements UsuarioRepository {

	UsuarioRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
}
