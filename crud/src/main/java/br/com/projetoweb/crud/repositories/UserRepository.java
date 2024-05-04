package br.com.projetoweb.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoweb.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
