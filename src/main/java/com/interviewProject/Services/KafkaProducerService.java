package com.interviewProject.Services;

import com.interviewProject.Model.Registration;
import com.interviewProject.Payloads.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

		@Autowired
		private KafkaTemplate<String, Registration> kafkaTemplate;

		public void sendMessage(Registration registration){
				kafkaTemplate.send(AppConstants.TOPIC, registration);
		}
}
