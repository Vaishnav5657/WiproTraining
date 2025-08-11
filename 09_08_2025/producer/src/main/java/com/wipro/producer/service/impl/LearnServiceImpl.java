package com.wipro.producer.service.impl;

import com.wipro.producer.dto.LearnDto;
import com.wipro.producer.service.LearnService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class LearnServiceImpl implements LearnService {
	
	
	@Autowired
	KafkaTemplate<String, LearnDto> kafkaTemplate;

	/*
	 * @Override public void sendData(String subject, String message) { // TODO
	 * Auto-generated method stub kafkaTemplate.send("learn-subject", message);
	 * 
	 * }
	 */

	@Override
	public void sendData(LearnDto learnDto) {
		kafkaTemplate.send("learn-subject", learnDto);
		
	}

}
