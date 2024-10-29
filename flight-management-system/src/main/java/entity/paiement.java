package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "paiements")
public class paiement {
    @Id
    @Column(name = "id_paiement")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private reservation reservation;
}