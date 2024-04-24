package application.model;

import jakarta.persistenco.Entity;
import jakarta.persistenco.Id;
import jakarta.persistenco.Table;

@Entity
@Table (name = "generos")
public class Genero {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id ; 
    @Column(nullable = false)
     private String nome ;

     public long getID() {
        return id;
     }
     public void setId(long id) {
        this.id = id;
     }
}
