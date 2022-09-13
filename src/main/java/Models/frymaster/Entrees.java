package Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="entree")
public class Entrees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String entree;

    @Column
    private String entree_image;


}
