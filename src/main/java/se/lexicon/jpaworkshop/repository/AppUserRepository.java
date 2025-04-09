package se.lexicon.jpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entity.AppUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);
    List<AppUser> findByRegistrationDateBetween(LocalDate startDate, LocalDate endDate);
    List<AppUser> findByDetailsId(int detailsId);
    Optional<AppUser> findByEmailIgnoreCase(String email);



}
