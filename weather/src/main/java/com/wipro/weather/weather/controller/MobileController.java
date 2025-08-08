package com.wipro.weather.weather.controller;

import org.springframework.web.bind.annotation.*;
import com.wipro.weather.weather.dto.MobileDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/mobile")
public class MobileController {
	
	private MobileDto mobile; 

    // POST: Create a mobile
    @PostMapping
    public String createMobile(@RequestBody MobileDto newMobile) {
        this.mobile = newMobile;
        System.out.println("Created: " + mobile);
        return "Mobile created successfully!";
    }

    // GET: Read the mobile
    @GetMapping
    public MobileDto getMobile() {
        System.out.println("Fetching mobile: " + mobile);
        return mobile;
    }

    // PUT: Update the mobile
    @PutMapping
    public String updateMobile(@RequestBody MobileDto updatedMobile) {
        this.mobile = updatedMobile;
        System.out.println("Updated: " + mobile);
        return "Mobile updated successfully!";
    }

    // DELETE: Delete the mobile
    @DeleteMapping
    public String deleteMobile() {
        System.out.println("Deleted mobile: " + mobile);
        this.mobile = null;
        return "Mobile deleted successfully!";
    }
}