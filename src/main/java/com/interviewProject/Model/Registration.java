package com.interviewProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		private String name;
		private String email;
		private String mobile;
		private String city;
}
