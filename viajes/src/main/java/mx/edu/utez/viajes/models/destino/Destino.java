package mx.edu.utez.viajes.models.destino;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.viajes.models.viaje.Viaje;


import java.util.List;


@Entity
@Table(name = "destinos")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private int cal;
    private String description;
    private Boolean availability;
    private String name;
    private int price;


    @OneToMany(mappedBy = "destino")
    private List<Viaje> viajes;



    public Destino(Long id, String name, String description, int cal, boolean availability, int price) {
    }
}
