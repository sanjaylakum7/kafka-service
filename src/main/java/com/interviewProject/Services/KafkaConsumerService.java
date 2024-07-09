package com.interviewProject.Services;

import com.interviewProject.Model.Registration;
import com.interviewProject.Payloads.AppConstants;
import com.interviewProject.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

		@Autowired
		private RegistrationRepository registrationRepository;

		@KafkaListener(topics = AppConstants.TOPIC, groupId = "group_id")
		public void consume(Registration registration){
				System.out.println("-----------------------------");
				registrationRepository.save(registration);
				System.out.println("-----------------------------");
		}
}
