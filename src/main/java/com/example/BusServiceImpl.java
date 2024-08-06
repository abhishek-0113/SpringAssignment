package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public BusServiceImpl(DataSource dataSource) {
    	jdbcTemplate=new JdbcTemplate(dataSource);
    }
    

//    @Override
    public void addBus(Bus bus) {
        String sql = "INSERT INTO buses (busname, location, ticket_price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, bus.getBusname(), bus.getLocation(), bus.getTicketPrice());
        System.out.println("bus name"+bus.getBusname());
    }

//    @Override
    public List<Bus> getAllBuses() {
        String sql = "SELECT * FROM buses";
        return jdbcTemplate.query(sql, new BusRowMapper());
    }

//    @Override
    public List<Bus> getBusesByLocation(String location) {
        String sql = "SELECT * FROM buses WHERE location = ?";
        return jdbcTemplate.query(sql, new BusRowMapper(), location);
    }

    private static class BusRowMapper implements RowMapper<Bus> {
//        @Override
        public Bus mapRow(ResultSet rs, int rowNum) throws SQLException {
            Bus bus = new Bus();
            bus.setBusname(rs.getString("busname"));
            bus.setLocation(rs.getString("location"));
            bus.setTicketPrice(rs.getDouble("ticket_price"));
            return bus;
        }
    }
}

