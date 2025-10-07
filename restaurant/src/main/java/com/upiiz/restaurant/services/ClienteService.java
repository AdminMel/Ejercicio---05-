package com.upiiz.restaurant.services;

import com.upiiz.restaurant.entities.Cliente;
import com.upiiz.restaurant.repositories.ClienteRepository;
import com.upiiz.restaurant.repositories.PedidoRepository;
import com.upiiz.restaurant.repositories.PlatilloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //CRUD Cliente
    public List<Cliente> getAllClientes() { return (List<Cliente>) clienteRepository.findAll(); }
    public Cliente getClienteById(int id) { return clienteRepository.findById(id).orElse(null); }
    public Cliente addCliente(Cliente cliente) { return clienteRepository.save(cliente); }
    public Cliente updateCliente(Cliente cliente) { return clienteRepository.save(cliente); }
    public void deleteCliente(int id) { clienteRepository.deleteById(id); }


}
