package Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper=false)
public class Empleado {
    private Double sueldoBase;
    private LocalDate fechaIngreso;
}
