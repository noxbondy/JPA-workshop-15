package se.lexicon.jpaworkshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 100)
    private String name;
    @Column(nullable = false,length = 100,unique = true)
    private String email;
    @Temporal(TemporalType.DATE)
    private LocalDate birthday;

    public UserDetails() {
    }

    public UserDetails(String name, String email, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }
}
