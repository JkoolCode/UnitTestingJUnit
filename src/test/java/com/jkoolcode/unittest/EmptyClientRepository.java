package com.jkoolcode.unittest;

import java.util.Optional;

//This class uses the Special Case Pattern
public class EmptyClientRepository implements ClientRepository {

	@Override
	public Optional<Client> search(Integer id) {
		return Optional.empty();
	}

}
