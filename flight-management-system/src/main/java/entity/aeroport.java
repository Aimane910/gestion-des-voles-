package entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "aeroports")
public class aeroport {
    @Id
    @Column(name = "id_aeroport")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAeroport;
    
    @Column(name = "aeroport_IATA", nullable = false, unique = true)
    private String aeroportIATA;
    
    @Column(name = "nom_aeroport", nullable = false)
    private String nomAeroport;
    
    @Column(nullable = false)
    private String ville;
    
    @Column(nullable = false)
    private String pays;
    
    @Column(nullable = false)
    private Integer capacite;
    
    @OneToMany(mappedBy = "aeroportDepart")
    private Set<vol> volsDepart;
    
    @OneToMany(mappedBy = "aeroportArrive")
    private Set<vol> volsArrive;
}