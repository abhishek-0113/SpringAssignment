package com.example;

import com.example.Bus;
import java.util.List;

public interface BusService {
    void addBus(Bus bus);
    List<Bus> getAllBuses();
    List<Bus> getBusesByLocation(String location);
}
