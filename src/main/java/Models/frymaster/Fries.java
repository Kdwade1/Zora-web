package Models.frymaster;

import javax.persistence.*;

@Entity
@Table(name="fries")

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




    public Fries() {
    }

    public Fries(long id, String fry_type, long stock, String fry_img) {
        this.id = id;
        this.fry_type = fry_type;
        this.stock = stock;
        this.fry_img = fry_img;
    }

    public Fries(String fry_type, long stock, String fry_img) {
        this.fry_type = fry_type;
        this.stock = stock;
        this.fry_img = fry_img;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFry_type() {
        return fry_type;
    }

    public void setFry_type(String fry_type) {
        this.fry_type = fry_type;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public String getFry_img() {
        return fry_img;
    }

    public void setFry_img(String fry_img) {
        this.fry_img = fry_img;
    }
}
