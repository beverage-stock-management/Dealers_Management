package com.beverageStock.dealer.repository;

import com.beverageStock.dealer.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {

}
