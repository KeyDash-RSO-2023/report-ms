//package com.rso.keydash.reportms.health;
//
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.actuate.health.HealthIndicator;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.RestTemplate;
//
//public class ExternalApiHealthIndicator implements HealthIndicator {
//
//    private final String apiEndpoint = "https://api.multiavatar.com/rso.svg";
//    private final RestTemplate restTemplate;
//
//    public ExternalApiHealthIndicator(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    @Override
//    public Health health() {
//        try {
//            ResponseEntity<String> response = restTemplate.getForEntity(apiEndpoint, String.class);
//            if (response.getStatusCode() == HttpStatus.OK) {
//                return Health.up().withDetail("externalApi", "Available").build();
//            } else {
//                return Health.down().withDetail("externalApi", "Not Available - Status: " + response.getStatusCode()).build();
//            }
//        } catch (HttpClientErrorException e) {
//            return Health.down().withDetail("externalApi", "Not Available - Exception: " + e.getMessage()).build();
//        }
//    }
//}
