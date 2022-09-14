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

    public Entrees() {
    }

    public Entrees(long id, String entree, String entree_image) {
        this.id = id;
        this.entree = entree;
        this.entree_image = entree_image;
    }

    public Entrees(String entree, String entree_image) {
        this.entree = entree;
        this.entree_image = entree_image;
    }

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getEntree_image() {
        return entree_image;
    }

    public void setEntree_image(String entree_image) {
        this.entree_image = entree_image;
    }
}
