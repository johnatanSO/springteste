package br.com.springteste.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.springteste.models.Warning;

@RestController
public class WarningController {
	
	@GetMapping("/warnings")
	public ResponseEntity<String> getAllWarnings() {
		System.out.printf("GET da rota 8080\n");

		return ResponseEntity.ok("Hello World!");
	}
	
	@PostMapping("/warnings")
	public ResponseEntity<String> createWarning(@RequestBody Warning warning) {
		String title = warning.title;
		String description = warning.description;

		Warning newWarning = new Warning(title, description);
		System.out.printf("Advertência criada: { title: %s, description: %s }", newWarning.title, newWarning.description);
		URI URINewWarning = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newWarning).toUri();

    return ResponseEntity.created(URINewWarning).build();
	}
}