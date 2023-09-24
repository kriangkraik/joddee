package net.joddee.main;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@SpringBootApplication
public class JoddeeApplication {
	Logger logger = LoggerFactory.getLogger(JoddeeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JoddeeApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		logger.info("An INFO Message : Route / is Normal");
		return "Hello World!";
	}

	@GetMapping("/status")
	@ResponseStatus(code = HttpStatus.OK)
	public String sayHello() {
		logger.info("An INFO Message : Route /status is Normal");
		JSONObject json = new JSONObject();
		json.put("statuscode", 200);
		json.put("message", "success");
		return json.toString(2);
	}
}
