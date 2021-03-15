package resume.repository.storage;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.RepositoryDefinition;
import resume.entity.Account;

import java.sql.Timestamp;
import java.util.List;

@RepositoryDefinition(domainClass= Account.class, idClass=Long.class)
public interface AccountRepository {

    Account findById(long id);
    Account findByUid(String uid);
    Account findByEmail(String email);
    Account findByPhone(String phone);

    int countByUid(String uid);

    Page<Account> findAllByCompletedTrue(Pageable pageable);

    List<Account> findCompletedFalseAndCreatedBefore(Timestamp oldDate);

}
