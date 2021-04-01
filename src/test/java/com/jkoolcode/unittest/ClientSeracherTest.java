package com.jkoolcode.unittest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class ClientSeracherTest {

	@Test
	void findExistingClients() {
		ClientRepository clientRepository = new FillClientRepositiry();
		ClientSearcher searcher = new ClientSearcher(clientRepository);
		
		final Integer EXISTING_CLIENT_ID = 1;
		Optional<Client> expectedClient = Optional.of(new Client(1, "Junior", "Oblitas", 26));
		
		assertEquals(expectedClient, searcher.search(EXISTING_CLIENT_ID));
	}
	
	@Test
	void findNonExistingClients() {
		ClientRepository emptyClientRepository = new EmptyClientRepository();
		ClientSearcher searcher = new ClientSearcher(emptyClientRepository);
		
		final Integer NON_EXISTING_CLIENT_ID = 1;
		Optional<Client> expectedEmptyResult = Optional.empty();
		
		assertEquals(expectedEmptyResult, searcher.search(NON_EXISTING_CLIENT_ID));
	}

}
