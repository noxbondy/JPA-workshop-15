package se.lexicon.jpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entity.AppUser;

import java.time.LocalDate;

import java.util.List;
;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

    AppUser findByUsername(String username);
    List<AppUser> findByRegDateBetween(LocalDate regDateAfter, LocalDate regDateBefore);
    List<AppUser>findByDetails_Id(Integer id);
    List<AppUser>findByUsernameContainingIgnoreCase(String username);


}
