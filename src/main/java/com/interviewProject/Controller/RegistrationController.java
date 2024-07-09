package com.interviewProject.Controller;

import com.interviewProject.Model.Registration;
import com.interviewProject.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegistrationController {

		@Autowired
		private RegistrationService registrationService;

		@PostMapping("/")
		public ResponseEntity<String> register(@RequestHeader("client_id") String client_id, @RequestBody Registration registration){
				return new ResponseEntity<>(registrationService.register(client_id, registration), HttpStatus.OK);
		}

		@PostMapping("/insert")
		public Registration registration(@RequestBody Registration registration){
				return registrationService.register(registration);
		}
}
