package entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;


@Data
@Entity
@Table(name = "passagers")
public class passager {
    @Id
    @Column(name = "id_passager")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPassager;
    
    @Column(name = "num_passeport")
    private String numPasseport;
    
    @Column(name = "num_carte_identite")
    private String numCarteIdentite;
    
    @Column(nullable = false)
    private String nationalite;
    
    private String adresse;
    private String telephone;
    
    @OneToMany(mappedBy = "passager")
    private Set<reservation> reservations;
}

