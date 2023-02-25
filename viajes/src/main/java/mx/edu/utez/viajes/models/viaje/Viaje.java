package mx.edu.utez.viajes.models.viaje;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.viajes.models.destino.Destino;
import mx.edu.utez.viajes.models.usuario.Usuario;


import java.util.Date;


@Entity
@Table(name = "viajes")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date departureDate;

    private Date entryDate;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @JsonIgnore
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_destino", referencedColumnName = "id")
    @JsonIgnore
    private Destino destino;

    public Viaje(Long id, String origen, String destiny, Date departureDate, Date entryDate, Integer availableSeats, Double price) {
    }
}
