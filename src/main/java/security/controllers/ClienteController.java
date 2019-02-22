package security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import security.models.Cliente;
import security.services.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@PostMapping("/")
	public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
		return new ResponseEntity<Cliente>(HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> read(@PathVariable(value = "id") Integer id){
		Cliente cliente = service.read(id);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@PutMapping("/")
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
		service.update(cliente);
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable(value = "id") Integer id){
		service.delete(id);
		return new ResponseEntity<Cliente>(HttpStatus.OK);
	}
	
	//Other methods
	@GetMapping("/")
	public ResponseEntity<List<Cliente>> readAll(){
		List<Cliente> clientes = service.readAll();
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}
}
