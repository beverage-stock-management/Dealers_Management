package com.beverageStock.dealer.service;

import com.beverageStock.dealer.entity.Dealer;
import com.beverageStock.dealer.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealerService {

    @Autowired
    private DealerRepository dealerRepository;

    public String addDealerDetails(Dealer dealer) {
        dealer.setTotal(dealer.getQuantity()* dealer.getItemPrice());
        dealerRepository.save(dealer);
        return "Added Successfully";
    }

    public Object getDetailsById(Integer id){
        Optional<Dealer> dealer = dealerRepository.findById(id);
        return dealer.isPresent() == true ? dealer : "User not found!.";
    }

    public List<Dealer> getAllDealerDetails() {
        return dealerRepository.findAll();
    }

    public String updateDealerDetails(Dealer dealer){
        dealer.setTotal(dealer.getQuantity()* dealer.getItemPrice());
        dealerRepository.save(dealer);
        return "Updated Successfully";
    }

    public String deleteDealerDetails(Integer id) {
        dealerRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
