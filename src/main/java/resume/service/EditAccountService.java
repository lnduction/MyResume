package resume.service;

import resume.entity.*;
import resume.form.SignUpForm;

import java.util.List;

public interface EditAccountService {

    Account createNewAccount(SignUpForm signUpForm);

    List<Skills> listSkills(long idAccount);
    List<SkillCategory> listSkillCategories();
    void updateSkills(long idProfile, List<Skills> skills);

    List<Practices> listPractices(long idAccount);
    void updatePractices(long idProfile, List<Practices> practices);

    List<Certificates> listCertificates(long idAccount);
    void updateCertificates(long idProfile, List<Certificates> certificates);

    List<Courses> listCourses(long idAccount);
    void updateCourses(long idProfile, List<Courses> courses);

    List<Education> listEducation(long idAccount);
    void updateEducation(long idProfile, List<Education> educations);

    List<Languages> listLanguages(long idAccount);
    void updateLanguages(long idProfile, List<Languages> languages);

    List<Hobbies> listHobbies(long idAccount);
    List<HobbyCategory> listHobbyCategory();
    void updateHobbies(long idAccount, List<Hobbies> hobbies);
}
