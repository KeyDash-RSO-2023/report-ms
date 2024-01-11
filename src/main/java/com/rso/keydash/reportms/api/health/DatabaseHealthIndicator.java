//package com.rso.keydash.reportms.health;
//
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.actuate.health.HealthIndicator;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//
//public class DatabaseHealthIndicator implements HealthIndicator {
//
//    private final DataSource dataSource;
//
//    public DatabaseHealthIndicator(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Override
//    public Health health() {
//        try (Connection connection = dataSource.getConnection()) {
//            if (connection.isValid(1)) {
//                return Health.up().withDetail("database", "Available").build();
//            } else {
//                return Health.down().withDetail("database", "Not Available").build();
//            }
//        } catch (Exception e) {
//            return Health.down(e).build();
//        }
//    }
//}
