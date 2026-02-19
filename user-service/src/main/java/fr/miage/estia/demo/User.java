package fr.miage.estia.demo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;
}
