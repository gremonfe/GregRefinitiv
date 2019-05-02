package org.refinitiv.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.refinitiv.Spring.entity.UserList;
/**
 * @author Gregorio Montiel
 *
 */
@Repository
public interface UserListRepository extends JpaRepository<UserList,Long>{

}
