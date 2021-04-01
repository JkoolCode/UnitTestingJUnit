package com.jkoolcode.unittest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//This class is intended to populate a bunch of clients for testing purpose
public class FillClientRepositiry implements ClientRepository{
	private Map<Integer, Client> clients = Collections.unmodifiableMap(new HashMap<Integer, Client>(){
		{
			put(1, new Client(1, "Junior", "Oblitas", 26));
			put(2, new Client(2, "Nathalie", "Oblitas", 25));
			put(3, new Client(3, "Brad", "Oblitas", 29));
		}
	});
	
	@Override
	public Optional<Client> search(Integer id) {
		return Optional.ofNullable(clients.get(id));
	}
	
}
