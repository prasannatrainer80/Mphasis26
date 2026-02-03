package com.mphasis.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cms.model.Wallet;
import com.mphasis.cms.repo.WalletRepository;

@Service
public class WalletService {

	@Autowired
	private WalletRepository walletRepo;
	
	public List<Wallet> showCustomerWallet(int custId) {
		return walletRepo.findByCusId(custId);
	}
	
	public Wallet showCustomerWalltInfo(int custId, String walType) {
		return walletRepo.findByCusIdAndWalSource(custId, walType);
	}
}
