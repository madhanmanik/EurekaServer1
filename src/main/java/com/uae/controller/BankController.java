package com.uae.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

	 @GetMapping("/txn")
	    public String getTransactionDetails(@RequestParam String xrNo) {
	        return xrNo+"getTrn";
	    }



}