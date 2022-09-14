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
    private String email;



    public User(long id, String fry_user, String password, String profile_img, String email) {
        this.id = id;
        this.fry_user = fry_user;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
    }

    public User(String fry_user, String password, String profile_img, String email) {
        this.fry_user = fry_user;
        this.password = password;
        this.profile_img = profile_img;
        this.email = email;
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFry_user() {
        return fry_user;
    }

    public void setFry_user(String fry_user) {
        this.fry_user = fry_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(String profile_img) {
        this.profile_img = profile_img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
