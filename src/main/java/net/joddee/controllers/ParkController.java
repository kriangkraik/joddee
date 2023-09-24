package net.joddee.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.joddee.entitys.Park;

@RestController
@RequestMapping("/park")
public class ParkController {
	Park park;
	
}
