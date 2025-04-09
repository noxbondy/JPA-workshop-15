package se.lexicon.jpaworkshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100,unique = true)
    private String username;
    @Column(nullable = false, length = 100)
    private String password;
    private LocalDate regDate;

@OneToOne
@JoinColumn(name="details_id")
private Details details;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
