package com.wipro.uber.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.uber.dto.Rider;
import com.wipro.uber.entity.Uber;
import com.wipro.uber.repo.UberRepo;
import com.wipro.uber.service.UberService;
import com.wipro.uber.util.AppContant;

@Service
public class UberServiceImpl implements UberService {
	
	@Autowired
	UberRepo uberRepo;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@KafkaListener(topics=AppContant.INCOMING_TOPIC_NAME,groupId="uber-rider")



	@Override
	public void receiveRiderData(Rider rider) {
		// TODO Auto-generated method stub
		System.out.println("msg from rider -- "+ rider);
		Uber uber = uberRepo.findByRiderId(rider.getRiderId());
		if(rider.getVehicalReq().equalsIgnoreCase("car") && uber.getCarQuantity()<= rider.getQuantity()) {
			int qun = uber.getCarQuantity() - rider.getQuantity();
			uber.setBikeQuantity(qun);
			rider.setStatus(true);
			rider.setRiderAmount(4000);
			uberRepo.save(uber);
			kafkaTemplate.send(AppContant.OUTGOING_TOPIC_NAME,rider);
		}
		else if(rider.getVehicalReq().equalsIgnoreCase("bike") && uber.getBikeQuantity()<= rider.getQuantity()) {
			int qun = uber.getBikeQuantity() - rider.getQuantity();
			uber.setBikeQuantity(qun);
			rider.setStatus(true);
			rider.setRiderAmount(2000);
			uberRepo.save(uber);
			
			kafkaTemplate.send(AppContant.OUTGOING_TOPIC_NAME,rider);
		}
		else {
			rider.setStatus(false);
			rider.setRiderAmount(0);
			uberRepo.save(uber);
			kafkaTemplate.send(AppContant.OUTGOING_TOPIC_NAME,rider);
		}



	}

	@Override
	public void save(Uber uber) {
		// TODO Auto-generated method stub
		uberRepo.save(uber);


	}

}


