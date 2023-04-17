package com.tenco.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

	/**
	 * 계좌 목록 페이지 
	 * @return 목록 페이지 이동
	 */
	@GetMapping({"/list", "/"})
	public String list() {
		return "/account/list";
	}
	
	// 출금 페이지 
	@GetMapping("/withdraw")
	public String withdraw() {
		return "/account/withdrawForm";
	}
	
	
	// 입금 페이지
	@GetMapping("/deposit")
	public String deposit() {
		return "/account/depositForm";
	}
	
	// 이체 페이지 
	@GetMapping("/transfer")
	public String transfer() {
		return "/account/transferForm";
	}
	
	// 계좌 생성 페이지 
	@GetMapping("/save")
	public String save() {
		return "/account/saveForm";
	}
	
	// 계좌 상세 보기 페이지 
	@GetMapping("/detail")
	public String detail() {
		return "";
	}
	
	
}



