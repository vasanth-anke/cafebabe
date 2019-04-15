package com.cafebabe.cafeservice.service;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface RestService {

	ObjectNode getDataFromURL(String url);

}