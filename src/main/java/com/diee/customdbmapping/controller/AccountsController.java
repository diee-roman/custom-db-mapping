package com.diee.customdbmapping.controller;

import com.diee.customdbmapping.model.projection.AccountBasicInfo;
import com.diee.customdbmapping.record.AccountInfo;
import com.diee.customdbmapping.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {

    private final AccountService accountService;

    public AccountsController(AccountService accountService) {this.accountService = accountService;}

    @GetMapping(value = "/accounts")
    public List<AccountInfo> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping(value = "/accounts/basic")
    public List<AccountBasicInfo> getAccountBasics() {
         return accountService.getAccountBasic();
    }

}
