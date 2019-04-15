package com.cafebabe.cafeservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class RestServiceImpl implements RestService {
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	@Transactional
	public ObjectNode getDataFromURL(String url) {
		ObjectNode objectNode = null;
		try {
			objectNode = restTemplate.getForObject(url, ObjectNode.class);
		} catch (Exception e) {
			
		}
		return objectNode;
	}
}
