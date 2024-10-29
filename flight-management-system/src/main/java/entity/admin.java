package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "admins")
public class admin extends User {
    @Column(name = "id_admin")
    private String idAdmin;
}
