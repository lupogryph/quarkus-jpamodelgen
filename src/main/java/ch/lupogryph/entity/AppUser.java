package ch.lupogryph.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "app_user")
@Data
@NoArgsConstructor
@NamedQuery(name = "AppUser.findAll", query = "SELECT u FROM AppUser u ORDER BY u.email")
public class AppUser {

    @Id
    private String email;

    private String password;

    @Enumerated(value = EnumType.STRING)
    private Role role;

}