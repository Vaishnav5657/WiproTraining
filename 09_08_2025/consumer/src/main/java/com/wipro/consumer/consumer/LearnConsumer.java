package com.wipro.consumer.consumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wipro.consumer.dto.LearnDto;


@Component
public class LearnConsumer {
	
		@KafkaListener(topics = "learn-subject", groupId = "group_id")
		public void consume(LearnDto learnDto) {
	        System.out.println("Consumed message: " + learnDto);
	    }

}
