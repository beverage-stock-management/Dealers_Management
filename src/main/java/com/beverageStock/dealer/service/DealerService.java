package com.beverageStock.dealer.service;

import com.beverageStock.dealer.entity.Dealer;
import com.beverageStock.dealer.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DealerService {

    @Autowired
    private DealerRepository dealerRepository;

    public String addDealerDetails(Dealer dealer) {
        dealer.setId(UUID.randomUUID().toString().split("-")[0]);
        dealer.setTotal(dealer.getQuantity()* dealer.getItemPrice());
        dealerRepository.save(dealer);
        return "Added Successfully";
    }

    public Object getDetailsById(String id){
        Optional<Dealer> dealer = dealerRepository.findById(id);
        return dealer.isPresent() == true ? dealer : "User not found!.";
    }

    public List<Dealer> getAllDealerDetails() {
        return dealerRepository.findAll();
    }

    public String updateDealerDetails(String id, Dealer dealer){

        Dealer existingDealer = dealerRepository.findById(id).get();

        existingDealer.setDealerName(dealer.getDealerName());
        existingDealer.setAddress(dealer.getAddress());
        existingDealer.setPhoneNo(dealer.getPhoneNo());
        existingDealer.setItem(dealer.getItem());
        existingDealer.setItemPrice(dealer.getItemPrice());
        existingDealer.setQuantity(dealer.getQuantity());
        existingDealer.setTotal(existingDealer.getQuantity() * existingDealer.getItemPrice());

        dealerRepository.save(existingDealer);
        return "Updated Successfully";
    }

    public String deleteDealerDetails(String id) {
        dealerRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
