package mx.edu.utez.viajes.controllers.viaje.dtos;

import mx.edu.utez.viajes.models.viaje.Viaje;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter


public class ViajeDto {
    private Long id;
    private String origen;
    private String destiny;
    private Date departureDate;
    private Date entryDate;
    private Integer availableSeats;
    private Double price;


///////////////////////////////////////////
    public Viaje parseToViaje() {
        return new Viaje(
                getId(),
                getOrigen(),
                getDestiny(),
                getDepartureDate(),
                getEntryDate(),
                getAvailableSeats(),
                getPrice()
        );
    }
}
