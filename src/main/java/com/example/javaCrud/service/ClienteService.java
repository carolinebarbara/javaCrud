package com.example.javaCrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.javaCrud.model.Cliente;
import com.example.javaCrud.repository.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public Cliente salvar(Cliente cliente){
        return repository.save(cliente);
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado){
        return repository.findById(id)
        .map(cliente -> {
            cliente.setNome(clienteAtualizado.getNome());
            cliente.setIdade(clienteAtualizado.getIdade());
            cliente.setSexo(clienteAtualizado.getSexo());
            cliente.setCidade(clienteAtualizado.getCidade());
            return repository.save(cliente);
        
        }).orElse(null);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
