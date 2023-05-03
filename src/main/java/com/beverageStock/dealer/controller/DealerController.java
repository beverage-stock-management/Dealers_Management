package com.beverageStock.dealer.controller;

import com.beverageStock.dealer.entity.Dealer;
import com.beverageStock.dealer.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DealerController {

    @Autowired
    private DealerRepository dealerRepository;

    @PostMapping("/addDealerDetails")
    public String addDealerDetails(@RequestBody Dealer dealer) {
        dealerRepository.save(dealer);
        return "Added Successfully";
    }

    @GetMapping("/getDealerDetails/{id}")
    public Object getDealerDetails(@PathVariable Integer id) {
        return dealerRepository.findById(id);
    }

    @GetMapping("/getAllDealerDetails")
    public List<Dealer> getAllDealerDetails() {
        return dealerRepository.findAll();
    }

    @PutMapping("updateDealerDetails")
    public String updateDealerDetails(@RequestBody Dealer dealer) {
        dealerRepository.save(dealer);
        return "Updated Successfully";
    }

    @DeleteMapping ("/deleteDealerDetails/{id}")
    public String deleteDealerDetails(@PathVariable Integer id) {
        dealerRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
