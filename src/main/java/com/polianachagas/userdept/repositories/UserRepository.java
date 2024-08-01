package com.polianachagas.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polianachagas.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
