package entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime; 

@Data
@Entity
@Table(name = "reservations")
public class reservation {
    @Id
    @Column(name = "id_reservation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    
    @ManyToOne
    @JoinColumn(name = "vol_reserve_id")
    private vol volReserve;
    
    @ManyToOne
    @JoinColumn(name = "passager_reservant_id")
    private passager passagerReservant;
    
    @Column(name = "date_reservation", nullable = false)
    private LocalDateTime dateReservation;
    
    @Column(nullable = false)
    private String status;
    
    @Column(name = "prix_total", nullable = false)
    private Double prixTotal;
    
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL)
    private paiement paiement;
}
