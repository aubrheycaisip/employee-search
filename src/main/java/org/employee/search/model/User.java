package org.employee.search.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User extends AbstractDate{

    public User(){

    }

    public User(Long id, String username, String password, Boolean isActive) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @NotNull(message="username is required")
    @Column(name="USER_NAME")
    private String username;

    @NotNull(message="password is required")
    @Column(name="PASSWORD")
    private String password;

    @Column(name="IS_ACTIVE")
    private Boolean isActive = false;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;
}
