package br.com.mv.inovation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mv.inovation.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

	Authority findByName(String name);
}
