package Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private Long id;

    private String razonSocial;
    private String cuit;
    private String condicionIva; // Ej: "Responsable Inscripto", "Monotributista", "Exento"


    private String direccion;
    private String localidad;
    private String zona;


    private String telefono;
    private String emailContacto;
    private String nombreContacto;

    private Double limiteCredito;
    private boolean activo; 
}