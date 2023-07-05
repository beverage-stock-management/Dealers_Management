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
    public Object getDetailsById(@PathVariable String id) {
        return dealerService.getDetailsById(id);
    }

    @GetMapping("/getAllDealerDetails")
    public List<Dealer> getAllDealerDetails() {
        return dealerService.getAllDealerDetails();
    }

    @PutMapping("updateDealerDetails/{id}")
    public String updateDealerDetails(@PathVariable String id, @RequestBody Dealer dealer) {
        return dealerService.updateDealerDetails(id,dealer);
    }

    @DeleteMapping ("/deleteDealerDetails/{id}")
    public String deleteDealerDetails(@PathVariable String id) {
        return dealerService.deleteDealerDetails(id);
    }
}
