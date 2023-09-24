package net.joddee.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/park")
public class ParkController {
	@GetMapping
	public String getMessage() {
		return "park";
	}
}
