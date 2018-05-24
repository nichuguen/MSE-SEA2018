package hello;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class FruitEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String kind;
    private String size;
    private String colour;
    public long getId() {
        return id;
    }
    public String getKind() {
        return kind;
    }
}
