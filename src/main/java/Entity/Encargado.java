package Entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Encargado extends  Info_General {

    Info_General info_general;


}
