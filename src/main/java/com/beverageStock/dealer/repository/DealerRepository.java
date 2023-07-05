package com.beverageStock.dealer.repository;

import com.beverageStock.dealer.entity.Dealer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DealerRepository extends MongoRepository<Dealer, String> {

}
