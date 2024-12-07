package com.klef.jfsd.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final RestTemplate restTemplate;
    private static final String FAKE_STORE_API_URL = "https://fakestoreapi.com/products";

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Object> fetchAllProducts() {
        Object[] products = restTemplate.getForObject(FAKE_STORE_API_URL, Object[].class);
        return Arrays.asList(products);
    }
}