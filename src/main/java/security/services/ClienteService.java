package security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.models.Cliente;
import security.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public void create(Cliente cliente) {
		repository.save(cliente);
	}

	public Cliente read(Integer id) {
		return repository.findById(id).get();
	}
	
	public void update(Cliente cliente) {
		repository.save(cliente);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	//Other methods
	public List<Cliente> readAll(){
		return repository.findAll();
	}
}