package se.lexicon.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entity.AppUser;
import se.lexicon.jpaworkshop.entity.Details;

import java.util.List;

@Repository
public interface DetailsRepository extends CrudRepository<AppUser, Integer> {
    Details FindByEmail(String email);
    List<Details> findByNameContaining(String name);
    List<Details> findByNameIgnoreCase(String name);


}
