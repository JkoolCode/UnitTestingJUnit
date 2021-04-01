package com.jkoolcode.unittest;

import java.util.Optional;

final public class ClientSearcher {
	private ClientRepository clientRepository;

	public ClientSearcher(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public Optional<Client> search(Integer id){
		return this.clientRepository.search(id);
	}
	
}
