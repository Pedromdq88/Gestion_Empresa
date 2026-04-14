package Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Preventista extends Empleado {
    private String zonaAsignada;
    private double comisionPorVenta;
}