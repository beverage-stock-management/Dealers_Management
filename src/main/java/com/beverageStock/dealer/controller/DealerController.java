package com.beverageStock.dealer.controller;

import com.beverageStock.dealer.entity.Dealer;
import com.beverageStock.dealer.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DealerController {

    @Autowired
    private DealerService dealerService;

    @PostMapping("/addDealerDetails")
    public String addDealerDetails(@RequestBody Dealer dealer) {
        return dealerService.addDealerDetails(dealer);
    }

    @GetMapping("/getDetailsById/{id}")
    public Object getDetailsById(@PathVariable Integer id) {
        return dealerService.getDetailsById(id);
    }

    @GetMapping("/getAllDealerDetails")
    public List<Dealer> getAllDealerDetails() {
        return dealerService.getAllDealerDetails();
    }

    @PutMapping("updateDealerDetails")
    public String updateDealerDetails(@RequestBody Dealer dealer) {
        return dealerService.updateDealerDetails(dealer);
    }

    @DeleteMapping ("/deleteDealerDetails/{id}")
    public String deleteDealerDetails(@PathVariable Integer id) {
        return dealerService.deleteDealerDetails(id);
    }
}
