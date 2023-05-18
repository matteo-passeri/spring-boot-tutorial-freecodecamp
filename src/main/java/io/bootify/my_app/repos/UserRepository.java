package io.bootify.my_app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import io.bootify.my_app.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
