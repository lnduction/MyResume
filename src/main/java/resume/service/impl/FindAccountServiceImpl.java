package resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import resume.entity.Account;
import resume.repository.storage.AccountRepository;
import resume.service.FindAccountService;

@Service
public class FindAccountServiceImpl implements FindAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account findByUid(String uid) {
        return accountRepository.findByUid(uid);
    }

    @Override
    public Account findBuId(long id) {
        return accountRepository.findById(id);
    }


}
