package com.mphasis.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.cms.model.Menu;
import com.mphasis.cms.model.Orders;
import com.mphasis.cms.model.Wallet;
import com.mphasis.cms.repo.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private WalletService walletService;
	
	public String palceOrder(Orders order) {
		Menu menu = menuService.searchById(order.getMenId());
		double price = menu.getMenuPrice();
		double billAmount = price * order.getOrdQty();
		Wallet wallet = 
		 walletService.showCustomerWalltInfo(order.getCusId(), 
				 order.getWalSource());
		double balance = wallet.getWalAmount(); 
		double diff = balance - billAmount;
		System.out.println("Difference is  " +diff);
		if (diff < 0) {
			return "Insufficient Funds...";
		}
		order.setOrdBillAmount(billAmount);
		order.setOrdStatus("PENDING");
		orderRepository.save(order);
		wallet.setWalAmount(diff);
		walletService.updateWallet(wallet);
		return "Order Placed Successfully...";
//		return "";
	}
}
