package resume.service;

import resume.entity.Account;

public interface FindAccountService {

    Account findByUid(String uid);

    Account findBuId(long id);
}
