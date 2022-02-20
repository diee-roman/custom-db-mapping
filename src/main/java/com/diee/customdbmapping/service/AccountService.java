package com.diee.customdbmapping.service;

import com.diee.customdbmapping.model.Account;
import com.diee.customdbmapping.model.projection.AccountBasicInfo;
import com.diee.customdbmapping.record.AccountInfo;
import com.diee.customdbmapping.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {this.accountRepository = accountRepository;}

    public List<AccountInfo> getAccounts() {
        return accountRepository.findAll().stream().map(this::recordFromEntity).collect(toList());
    }

    public List<AccountBasicInfo> getAccountBasic() {
        return accountRepository.getBasicInfo();
    }

    private AccountInfo recordFromEntity(Account account) {
        return new AccountInfo(account.getUserId(), account.getUsername(), account.getEmail(), account.getPassword(), account.getCreatedOn(),
            account.getLastLogin(), account.getRoles());
    }
}
