package com.marketwinks.mwnotifications.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marketwinks.mwnotifications.model.notification;
import com.marketwinks.mwnotifications.repository.NotificationRepository;

@RestController
@RequestMapping("/notification")
public class NotificationService {

	@Autowired
	private NotificationRepository NotificationRepository;

	@org.springframework.scheduling.annotation.Async
	@RequestMapping(value = "/{targetuser}/{message}/add", method = RequestMethod.GET)
	public boolean AddNotifications(@PathVariable String targetuser, @PathVariable String message) {

		boolean execution_result = false;

		// save to the db
		notification notification = new notification();
		notification.setMessage(message);
		notification.setTargetuser(targetuser);
		notification.setRead(false);
		java.time.LocalDateTime time = LocalDateTime.now();
		notification.setTime(time);

		notification result = NotificationRepository.save(notification);

		execution_result = true;
		return execution_result;

	}

}
