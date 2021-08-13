package org.ddangelorb.jauthservice.repository;

import org.ddangelorb.jauthservice.model.Users;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	  boolean existsByUsername(String username);

	  Users findByUsername(String username);

	  //@Transactional
	  //void activateByUsername(String username);

}
