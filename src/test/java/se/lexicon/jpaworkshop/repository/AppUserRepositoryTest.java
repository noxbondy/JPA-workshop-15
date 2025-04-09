package se.lexicon.jpaworkshop.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpaworkshop.entity.AppUser;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class AppUserRepositoryTest {
    @Autowired
    AppUserRepository appUserRepository;

    @Test
    void findByUsername() {
        AppUser user = new AppUser("noxbondy","password");
        appUserRepository.save(user);
        var found = appUserRepository.findByUsername("noxbondy");
        assertThat(found).isPresent();
        assertThat(found.get().getUsername()).isEqualTo("johndoe");
    }

    @Test
    void findByRegistrationDateBetween() {
    }

    @Test
    void findByDetailsId() {
    }

    @Test
    void findByEmailIgnoreCase() {
    }
}