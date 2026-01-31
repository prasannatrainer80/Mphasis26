package com.mphasis.cms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.cms.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
