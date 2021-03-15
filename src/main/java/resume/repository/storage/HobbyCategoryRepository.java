package resume.repository.storage;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.RepositoryDefinition;
import resume.entity.HobbyCategory;

import java.util.List;

@RepositoryDefinition(domainClass= HobbyCategory.class, idClass=Long.class)
public interface HobbyCategoryRepository {

    List<HobbyCategory> findAll(Sort sort);
}
