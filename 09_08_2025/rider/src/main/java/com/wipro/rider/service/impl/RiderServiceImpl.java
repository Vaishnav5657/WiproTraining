package com.wipro.rider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.wipro.rider.entity.Rider;
import com.wipro.rider.repo.RiderRepo;
import com.wipro.rider.service.RiderService;
import com.wipro.rider.util.AppRider;

public class RiderServiceImpl implements RiderService {
	

	@Autowired
	RiderRepo riderRepo;
	
	@Autowired
	KafkaTemplate kafkaTemplate;


	@Override
	public void check(Rider rider) {
		// TODO Auto-generated method stub
		rider.setStatus(false);
		riderRepo.save(rider);
		kafkaTemplate.send(AppRider.OUTGOING_TOPIC_NAME, rider);


	}

}
