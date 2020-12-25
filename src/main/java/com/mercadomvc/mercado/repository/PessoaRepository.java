package com.mercadomvc.mercado.repository;

import java.util.List;

import com.mercadomvc.mercado.model.Pessoa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
	
	@Query("select u from Pessoa u where u.nome like %?1%")
	List<Pessoa> findPessoaByNome(String nome);
}
