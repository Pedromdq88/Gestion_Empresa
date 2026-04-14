package Entity;
import jakarta.persistence.Entity;
import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Info_General {
    private Long id;
    private char nombre_completo;
    private  String dni;
    private char mail;
    private String password;

    private Rol rol;

    public char getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(char nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getMail() {
        return mail;
    }

    public void setMail(char mail) {
        this.mail = mail;
    }


    public String getPassword() {return password;}
}
