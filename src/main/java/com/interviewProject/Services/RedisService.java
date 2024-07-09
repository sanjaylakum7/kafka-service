package com.interviewProject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

		@Autowired
		private StringRedisTemplate redisTemplate;

		public String getClientStatus(String clientId){
				return redisTemplate.opsForValue().get(clientId);
		}
}
