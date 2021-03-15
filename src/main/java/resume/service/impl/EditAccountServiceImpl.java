package resume.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resume.entity.*;
import resume.exeption.CantCompleteClientRequestException;
import resume.form.SignUpForm;
import resume.repository.storage.AccountRepository;
import resume.repository.storage.HobbyCategoryRepository;
import resume.repository.storage.SkillCategoryRepository;
import resume.service.EditAccountService;
import resume.util.DataUtil;

import java.util.List;

@Service
public class EditAccountServiceImpl implements EditAccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EditAccountServiceImpl.class);

    @Autowired private AccountRepository accountRepository;
    @Autowired private SkillCategoryRepository skillCategoryRepository;
    @Autowired private HobbyCategoryRepository hobbyCategoryRepository;

    @Value("${generate.uid.suffix.length}") private int generateUidSuffixLength;
    @Value("${generate.uid.alphabet}") private String generateUidAlphabet;
    @Value("${generate.uid.max.try.count}") private int maxTryCountToGenerateUid;


    @Override
    @Transactional
    public Account createNewAccount(SignUpForm signUpForm) {
        Account account = new Account();
        account.setUid(generateAccountUid(signUpForm));
        account.setFirstName(DataUtil.capitalizeName(signUpForm.getFirstName()));
        account.setLastName(DataUtil.capitalizeName(signUpForm.getLastName()));
        account.getPrivacy().setPassword(signUpForm.getPassword());
        account.setCompeted(false);
       // accountRepository.save(account);
        return account;
    }

    private String generateAccountUid(SignUpForm signUpForm) throws CantCompleteClientRequestException {
        String baseUid = DataUtil.generateProfileUid(signUpForm);
        String uid = baseUid;
        for (int i = 0; accountRepository.countByUid(uid) > 0; i++) {
            uid = DataUtil.regenerateUidWithRandomSuffix(baseUid, generateUidAlphabet, generateUidSuffixLength);
            if (i >= maxTryCountToGenerateUid)
                throw new CantCompleteClientRequestException("Can't generate unique uid for profile: " + baseUid+": maxTryCountToGenerateUid detected");
        } return uid;
    }

    @Override
    public List<Skills> listSkills(long idAccount) {
        return accountRepository.findById(idAccount).getSkills();
    }

    @Override
    public List<SkillCategory> listSkillCategories() {
        return skillCategoryRepository.findAll(new Sort("id"));
    }

    @Override
    public void updateSkills(long idProfile, List<Skills> updatedData) {
        Account profile = accountRepository.findById(idProfile);
        if (CollectionUtils.isEqualCollection(updatedData, profile.getSkills()))
            LOGGER.debug("Profile skills: nothing to update");
         else {
            profile.setSkills(updatedData);
           // accountRepository.save(profile);
        }
    }

    @Override
    public List<Practices> listPractices(long idAccount) {
        return accountRepository.findById(idAccount).getPractices();
    }

    @Override
    public void updatePractices(long idAccount, List<Practices> updatedData) {
        Account profile = accountRepository.findById(idAccount);
        if (CollectionUtils.isEqualCollection(updatedData, profile.getPractices())) LOGGER.debug("Profile skills: nothing to update");
        else {
            profile.setPractices(updatedData);
            // accountRepository.save(profile);
        }
    }

    @Override
    public List<Certificates> listCertificates(long idAccount) {
        return accountRepository.findById(idAccount).getCertificates();
    }

    @Override
    public void updateCertificates(long idAccount, List<Certificates> updatedData) {
        Account profile = accountRepository.findById(idAccount);
        if (CollectionUtils.isEqualCollection(updatedData, profile.getCertificates()))
            LOGGER.debug("Profile skills: nothing to update");
        else {
            profile.setCertificates(updatedData);
            // accountRepository.save(profile);
        }
    }

    @Override
    public List<Courses> listCourses(long idAccount) {
        return accountRepository.findById(idAccount).getCourses();
    }

    @Override
    public void updateCourses(long idAccount, List<Courses> updatedData) {
        Account profile = accountRepository.findById(idAccount);
        if (CollectionUtils.isEqualCollection(updatedData, profile.getCourses()))
            LOGGER.debug("Profile skills: nothing to update");
        else {
            profile.setCourses(updatedData);
            // accountRepository.save(profile);
        }
    }

    @Override
    public List<Education> listEducation(long idAccount) {
        return accountRepository.findById(idAccount).getEducations();
    }

    @Override
    public void updateEducation(long idAccount, List<Education> updatedData) {
        Account profile = accountRepository.findById(idAccount);
        if (CollectionUtils.isEqualCollection(updatedData, profile.getEducations()))
            LOGGER.debug("Profile skills: nothing to update");
        else {
            profile.setEducations(updatedData);
            // accountRepository.save(profile);
        }
    }

    @Override
    public List<Languages> listLanguages(long idAccount) {
        return accountRepository.findById(idAccount).getLanguages();
    }

    @Override
    public void updateLanguages(long idAccount, List<Languages> updatedData) {
        Account profile = accountRepository.findById(idAccount);
        if (CollectionUtils.isEqualCollection(updatedData, profile.getLanguages()))
            LOGGER.debug("Profile skills: nothing to update");
        else {
            profile.setLanguages(updatedData);
            // accountRepository.save(profile);
        }
    }

    @Override
    public List<Hobbies> listHobbies(long idAccount) {
        return accountRepository.findById(idAccount).getHobbies();
    }

    @Override
    public void updateHobbies(long idAccount, List<Hobbies> updatedData) {
        Account profile = accountRepository.findById(idAccount);
        if (CollectionUtils.isEqualCollection(updatedData, profile.getHobbies()))
            LOGGER.debug("Profile skills: nothing to update");
        else {
            profile.setHobbies(updatedData);
            // accountRepository.save(profile);
        }
    }

    @Override
    public List<HobbyCategory> listHobbyCategory() {
        return hobbyCategoryRepository.findAll(new Sort("id"));
    }
}
