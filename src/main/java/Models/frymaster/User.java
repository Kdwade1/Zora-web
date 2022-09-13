package Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String fry_user;

    @Column(nullable = false)
    private String password;

    @Column
    private String profile_img;

    @Column(nullable = false)
    private String emaill;
}
