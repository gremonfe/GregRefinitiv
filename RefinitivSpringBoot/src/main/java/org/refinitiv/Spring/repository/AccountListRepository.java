package org.refinitiv.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.refinitiv.Spring.entity.AccountList;
/**
 * @author Gregorio Montiel
 *
 */
@Repository
public interface AccountListRepository extends JpaRepository<AccountList,Long>{

}
