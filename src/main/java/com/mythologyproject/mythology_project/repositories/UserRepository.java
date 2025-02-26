package com.mythologyproject.mythology_project.repositories;

import com.mythologyproject.mythology_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("from User u where u.username = ?1")
    User findByUsername(String username);

    @Query("from User u where u.email = ?1")
    User findByEmail(String username);
}
