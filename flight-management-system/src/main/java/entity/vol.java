package entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;
import java.time.LocalDateTime; 

@Data
@Entity
@Table(name = "vols")
public class vol {
    @Id
    @Column(name = "id_vol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVol;
    
    @Column(name = "num_vol", nullable = false)
    private String numVol;
    
    @Column(name = "vol_IATA", nullable = false)
    private String volIATA;
    
    @Column(name = "date_vol", nullable = false)
    private LocalDateTime dateVol;
    
    @ManyToOne
    @JoinColumn(name = "aeroport_depart_id")
    private aeroport aeroportDepart;
    
    @ManyToOne
    @JoinColumn(name = "aeroport_arrive_id")
    private aeroport aeroportArrive;
    
    @ManyToOne
    @JoinColumn(name = "avion_id")
    private avion avion;
    
    @OneToMany(mappedBy = "vol")
    private Set<reservation> reservations;
}
