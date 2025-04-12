package se.lexicon.jpaworkshop.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpaworkshop.entity.UserDetails;

import java.util.List;



@DataJpaTest
class DetailsRepositoryTest {
    @Autowired
   private UserDetailsRepository UserDetailsRepository;
    @Autowired
    private UserDetailsRepository userDetailsRepository;


    @Test
   void findbyName(){
        UserDetails details = new UserDetails();
        details.setName("John");
        details.setEmail("john@example.com");
        UserDetailsRepository.save(details);
        List<UserDetails> detailsList = UserDetailsRepository.findByName("John");
        Assertions.assertEquals(1, detailsList.size());

    }
    @Test
    void findbyEmail(){
    UserDetails details = new UserDetails();
    details.setName("John");
    details.setEmail("john@example.com");
    UserDetails details1= userDetailsRepository.save(details);
    Assertions.assertNotNull(details1);

    }
    @Test
    void findbyNameContaining(){
        UserDetails details = new UserDetails();
        details.setName("John");
        details.setEmail("john@example.com");
        UserDetails details1= userDetailsRepository.save(details);
        Assertions.assertNotNull(details1);
    }

    @Test
    void findbyNameIgnoreCase(){
        UserDetails details = new UserDetails();
        details.setName("John");
        details.setEmail("john@example.com");
        UserDetails details1= userDetailsRepository.save(details);
        Assertions.assertNotNull(details1);
    }
    @Test
    void findByEamilIgnoreCase(){
        UserDetails details = new UserDetails();
        details.setName("John");
        details.setEmail("john@example.com");
        UserDetails details1= userDetailsRepository.save(details);
        Assertions.assertNotNull(details1);
    }
@Test
    void findByNameContainingIgnoreCase(){
        UserDetails details = new UserDetails();
        details.setName("John");
        details.setEmail("john@example.com");
        UserDetails details1= userDetailsRepository.save(details);
        Assertions.assertNotNull(details1);
}
@Test
    void findByBirthday(){
        UserDetails details = new UserDetails();
        details.setName("John");
        details.setEmail("john@example.com");
        UserDetails details1= userDetailsRepository.save(details);
        List<UserDetails>details2 = userDetailsRepository.findByBirthday(details1.getBirthday());
        Assertions.assertNotNull(details2);


}
}