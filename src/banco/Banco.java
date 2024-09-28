package banco;
import java.util.ArrayList;

class Banco {
    // Variable de instancia privada para almacenar una lista dinámica de clientes.
    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();
    
    // Método para agregar un cliente a la lista del banco.
    public void agregarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);  // El ArrayList se encarga de ajustar su tamaño automáticamente
    }

    // Método para obtener un cliente por su nombre.
    public Cliente getCliente(String nombre) {
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null; // Retorna null si no se encuentra el cliente.
    }

    // Método para obtener un cliente por su índice en la lista.
    public Cliente getCliente(int index) {
        if (index >= 0 && index < listaDeClientes.size()) {
            return listaDeClientes.get(index);
        }
        return null; // Retorna null si el índice está fuera del rango.
    }

    // Método para obtener el número de clientes registrados.
    public int getNumeroClientes() {
        return listaDeClientes.size();  // El tamaño de la lista se obtiene directamente
    }
}