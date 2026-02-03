package com.mphasis.cms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.cms.model.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {
	List<Wallet> findByCusId(int cusId);
	Wallet findByCusIdAndWalSource(int cusId, String walSource);
}
