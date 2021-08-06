package org.ddangelorb.jauthservice.repository;

import org.ddangelorb.jauthservice.model.User;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	  boolean existsByUsername(String username);

	  User findByUsername(String username);

	  @Transactional
	  void activateByUsername(String username);

}
