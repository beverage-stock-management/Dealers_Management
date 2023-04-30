package com.beverageStock.dealer.controller;

import com.beverageStock.dealer.entity.Dealer;
import com.beverageStock.dealer.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class DealerController {

    @Autowired
    private DealerRepository dealerRepository;

    @CrossOrigin
    @PostMapping("/addDealerDetails")
    public Dealer addDealerDetails(@RequestBody Dealer dealer) {
        return dealerRepository.save(dealer);
    }

//    @GetMapping("/addDealerDetails/{id}")
//    public Dealer getDealerDetails(@PathVariable Integer id) {
//        return dealerRepository.getAccDetailsById(id);
//    }
}
