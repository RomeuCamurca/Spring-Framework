package com.romeu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romeu.model.Cliente;
import com.romeu.repository.ClientesRepository;

@Service
public class ClientesService {
	
	// primeira forma de injeção de dependências
	
	/* private ClientesRepository repository;

    public ClientesService( ClientesRepository repository ){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    } */
    
    // segunda forma de injeção de dependências
    
	/* private ClientesRepository repository;
	
	@Autowired
    public ClientesService(ClientesRepository repository ) {
    	this.repository = repository;
    }
    
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    } */
    
	// terceira forma de injeção de dependências = A MELHOR AO MEU VER :)
    
	@Autowired
	private ClientesRepository repository;
    
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        repository.persistir(cliente);
    }
 
    // quarta forma de injeção de dependências
    
	/* private ClientesRepository repository;
	
	@Autowired
	public void setRepository(ClientesRepository repository) {
		this.repository = repository;
	}
	
	public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        repository.persistir(cliente);
    } */
	
	// quinta forma de injeção de dependências
	
	/* public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);
    } */
	
    public void validarCliente(Cliente cliente){
        //aplica validações
    }

}
