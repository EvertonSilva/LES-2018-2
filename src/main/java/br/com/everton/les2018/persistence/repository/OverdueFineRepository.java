package br.com.everton.les2018.persistence.repository;

import br.com.everton.les2018.model.OverdueFine;
import br.com.everton.les2018.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OverdueFineRepository extends JpaSpecificationRepository<OverdueFine, Long> {

    @Query("select distinct o from OverdueFine o where o.loan.user.id = :id")
    List<OverdueFine> findByUser(@Param("id")Long userId);
}
