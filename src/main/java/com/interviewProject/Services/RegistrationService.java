package com.interviewProject.Services;

import com.interviewProject.Model.Registration;
import com.interviewProject.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

		@Autowired
		private RegistrationRepository registrationRepository;

		@Autowired
		private RedisService redisService;

		@Autowired
		private KafkaProducerService kafkaProducerService;

		public String register(String client_id, Registration registration) {
				String status = redisService.getClientStatus(client_id);

				if ("active".equals(status)) {
						kafkaProducerService.sendMessage(registration);
						return "Client registered";
				}

				return "Client not registered";
		}

		public Registration register(Registration registration) {
				return registrationRepository.save(registration);
		}
}
