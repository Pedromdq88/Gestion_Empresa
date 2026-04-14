package Service;
import Entity.Cliente;
import Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @PreAuthorize("hasAnyAuthority('DUENIO', 'ENCARGADO')")
    public Cliente crearNuevoCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Iterable<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }
}
