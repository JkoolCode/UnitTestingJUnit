package com.jkoolcode.unittest;
import java.util.Optional;

public interface ClientRepository {
	
	public Optional<Client> search(Integer id);
	
}
