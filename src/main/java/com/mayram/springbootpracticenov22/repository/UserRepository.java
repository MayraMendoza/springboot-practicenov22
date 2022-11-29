package com.mayram.springbootpracticenov22.repository;

import com.mayram.springbootpracticenov22.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
