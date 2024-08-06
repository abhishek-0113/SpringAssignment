package com.example;

import com.example.Bus;
import com.example.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("/addbus")
    public String showAddBusForm(Model model) {
        model.addAttribute("bus", new Bus());
        return "addBus";
    }

    @PostMapping("/addbuses")
    public String addBus(@ModelAttribute Bus bus) {
        busService.addBus(bus);
        return "redirect:/buses";
    }

    @GetMapping("/buses")
    public String getAllBuses(Model model) {
        List<Bus> buses = busService.getAllBuses();
        for(Bus s:buses) {
        	System.out.println(s);
        }
        model.addAttribute("buses", buses);
        return "buses";
    }

    @GetMapping("/buses/{location}")
    public String getBusesByLocation(@PathVariable("location") String location, Model model) {
        List<Bus> buses = busService.getBusesByLocation(location);
        model.addAttribute("buses", buses);
        return "buses";
    }
}
