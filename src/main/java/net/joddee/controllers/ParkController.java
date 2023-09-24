package net.joddee.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.joddee.entitys.Park;

@RestController
@RequestMapping("/park")
public class ParkController {
	Park park;

	@GetMapping("/park/{parkId}")
	public Park getParkbyId(@PathVariable Integer parkId) {
		return park;
	}

	@PutMapping
	public String updateParks(@RequestBody Park park) {
		this.park = park;
		return "Park Updated Successfully";
	}

	@DeleteMapping("/park/{parkId}")
	public String deleteParks(@PathVariable Integer parkId) {
		this.park = null;
		return "Park Deleted Successfully";
	}

}
