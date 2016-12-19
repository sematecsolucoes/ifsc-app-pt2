package br.com.sematec.financas.teste;

import javax.persistence.EntityManager;

import br.com.sematec.financas.util.JPAUtil;
import br.com.sematec.modelo.Conta;

public class TesteJPA {

	public static void main(String[] args) {

		double inicio = System.currentTimeMillis();

		Conta conta = new Conta();
		conta.setTitular("Joao Ferreira");
		conta.setBanco("HSBC");
		conta.setNumero("123345");
		conta.setAgencia("321");

		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		manager.persist(conta);

		manager.getTransaction().commit();

		manager.close();

		double fim = System.currentTimeMillis();
		System.out.println("Executado em: " + (fim - inicio) / 1000 + "s");

	}
}
