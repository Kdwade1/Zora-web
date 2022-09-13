package Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="Fries")

public class Fries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    String fry_type;

    @Column
    private long stock;

    @Column
    private String fry_img;

}
