package se.lexicon.jpaworkshop.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpaworkshop.entity.AppUser;
import se.lexicon.jpaworkshop.entity.UserDetails;

import java.time.LocalDate;
import java.util.List;

@DataJpaTest
public class AppUserRepositoryTest {

    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private UserDetailsRepository detailsRepository;


@Test
    void findByUsername(){
    AppUser user= new AppUser();
    user.setUsername("admin");
    user.setPassword("password");
    user.setRegDate(LocalDate.of(2020,1,1));
    AppUser saved = appUserRepository.save(user);
    AppUser found = appUserRepository.findByUsername(saved.getUsername());
    Assertions.assertEquals(saved.getUsername(), found.getUsername());
}
@Test
    void findByRegDateBetween(){
   LocalDate start = LocalDate.of(2020,1,1);
   LocalDate end = LocalDate.of(2020,2,1);
   List<AppUser> list = appUserRepository.findByRegDateBetween(start, end);
   Assertions.assertNotNull(list);
}
@Test
    void findByDetails_Id(){
  UserDetails details = new UserDetails();
  details.setName("admin");
  details.setEmail("admin@email.com");
  UserDetails saved = detailsRepository.save(details);
  appUserRepository.findByDetails_Id(saved.getId());
  Assertions.assertNotNull(saved);
}
@Test
    void findByUsernameContainingIgnoreCase(){
    AppUser user = new AppUser();
    user.setUsername("admin");
    user.setPassword("password");
    user.setRegDate(LocalDate.of(2020,1,1));
    AppUser saved = appUserRepository.save(user);
    List<AppUser> list = appUserRepository.findByUsernameContainingIgnoreCase(saved.getUsername());
    Assertions.assertNotNull(list);

}

}
