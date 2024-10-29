package entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;

@Data
@Entity
@Table(name = "avions")
public class avion {
    @Id
    @Column(name = "id_avion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvion;
    
    @Column(name = "type_avion", nullable = false)
    private String typeAvion;
    
    @Column(nullable = false)
    private Integer capacite;
    
    @Column(name = "annee_fab")
    private Integer anneeFab;
    
    @Column(nullable = false)
    private String model;
    
    @OneToMany(mappedBy = "avion")
    private Set<vol> vols;
}
