package entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "membre_equipages")
public class membreEquipage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nom_complet", nullable = false)
    private String nomComplet;
    
    @Column(nullable = false)
    private String fonction;
    
    @Column(name = "num_licence")
    private String numLicence;
    
    @Column(nullable = false)
    private String nationalite;
    
    private String option;
    
    @ManyToMany(mappedBy = "equipage")
    private Set<vol> vols;
}