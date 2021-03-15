package resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import resume.form.*;
import resume.repository.storage.*;
import resume.service.EditAccountService;
import resume.service.FindAccountService;
import javax.validation.Valid;
import java.util.*;




@Controller
public class EditProfileController {

    @Autowired private SkillCategoryRepository skillCategoryRepository;
    @Autowired private AccountRepository accountRepository;
    @Autowired private HobbyCategoryRepository hobbyCategoryRepository;

    @Autowired private EditAccountService editAccountService;
    @Autowired private FindAccountService findAccountService;

    private Long accountId = (long) 3;

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String getEdit() { return "redirect:/edit/basic"; }

    @RequestMapping(value = "/edit/basic", method = RequestMethod.GET)
    public String getEditBasic(Model model) {
        model.addAttribute("account", new AccountForm(findAccountService.findBuId(accountId)));
        return gotoBasicJSP(model);
    }

    public String gotoBasicJSP(Model model){
        model.addAttribute("basic1", "active");
        model.addAttribute("basic2", "aria-selected=\"true\"");
        return "edit";
    }

    @RequestMapping(value = "/edit/basic", method = RequestMethod.POST)
    public String postEdit(@Valid @ModelAttribute("accountForm") AccountForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("account", form);
            return gotoBasicJSP(model);
        }
        //todo update basic
            return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/contacts", method = RequestMethod.GET)
    public String getEditContacts(Model model) {
        model.addAttribute("contacts", new ContactsForm(findAccountService.findBuId(accountId).getContacts()));
        return gotoContactsJSP(model);
    }

    private String gotoContactsJSP(Model model) {
        model.addAttribute("contacts1", "active");
        model.addAttribute("contacts2", "aria-selected=\"true\"");
        return "edit";
    }

    @RequestMapping(value = "/edit/contacts", method = RequestMethod.POST)
    public String postContacts(@Valid @ModelAttribute("contactsForm") ContactsForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("contacts", form);
            return gotoContactsJSP(model);
        }
        //todo update contacts
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/skills", method = RequestMethod.GET)
    public String getEditSkills(Model model) {
        model.addAttribute("skills", new SkillForm(editAccountService.listSkills(accountId)));
        return gotoSkillJSP(model);
    }

    private String gotoSkillJSP(Model model) {
        model.addAttribute("skills1", "active");
        model.addAttribute("skills2", "aria-selected=\"true\"");
        model.addAttribute("skillCategories", editAccountService.listSkillCategories());
        return "edit";
    }

    @RequestMapping(value = "/edit/skills", method = RequestMethod.POST)
    public String postSkills(@Valid @ModelAttribute("skillForm") SkillForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("skills", form);
            return gotoSkillJSP(model);
        }
        //todo update skills
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/practices", method = RequestMethod.GET)
    public String getEditPractices(Model model) {
        model.addAttribute("practices", new PracticeForm(editAccountService.listPractices(accountId)));
        return gotoPracticesJSP(model);
    }

    private String gotoPracticesJSP(Model model) {
        model.addAttribute("practices1", "active");
        model.addAttribute("practices2", "aria-selected=\"true\"");
        model.addAttribute("mouths", getMouth());
        model.addAttribute("years", getYears());
        return "edit";
    }

    @RequestMapping(value = "/edit/practices", method = RequestMethod.POST)
    public String postPractices(@Valid @ModelAttribute("practiceForm") PracticeForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("practices", form);
            return gotoPracticesJSP(model);
        }

        //todo update practice
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/education", method = RequestMethod.GET)
    public String getEditEducation(Model model) {
        model.addAttribute("educations", new EducationForm(editAccountService.listEducation(accountId)));
        return gotoEducationJSP(model);
    }

    private String gotoEducationJSP(Model model) {
        model.addAttribute("education1", "active");
        model.addAttribute("education2", "aria-selected=\"true\"");
        return "edit";
    }

    @RequestMapping(value = "/edit/education", method = RequestMethod.POST)
    public String postEducation(@Valid @ModelAttribute("educationForm") EducationForm form, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("education", form);
            return gotoEducationJSP(model);
        }
        //todo education update
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/certificates", method = RequestMethod.GET)
    public String getEditCertificates(Model model) {
        model.addAttribute("certificates1", "active");
        model.addAttribute("certificates2", "aria-selected=\"true\"");
        model.addAttribute("certificates", new CertificateForm(editAccountService.listCertificates(accountId)));
        return "edit";
    }

    @RequestMapping(value = "/edit/certificates", method = RequestMethod.POST)
    public String postCertificates() {
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/courses", method = RequestMethod.GET)
    public String getEditCourses(Model model) {
        model.addAttribute("courses", new CourseForm(editAccountService.listCourses(accountId)));
        return gotoCourseJSP(model);
    }

    private String gotoCourseJSP(Model model) {
        model.addAttribute("courses1", "active");
        model.addAttribute("courses2", "aria-selected=\"true\"");
        return "edit";
    }

    @RequestMapping(value = "/edit/courses", method = RequestMethod.POST)
    public String postCourses(@Valid @ModelAttribute("courseForm") CourseForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()){
            model.addAttribute("courses", form);
            return gotoCourseJSP(model);
        }

        //todo update course
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/languages", method = RequestMethod.GET)
    public String getEditLanguages(Model model) {
        model.addAttribute("languages", new LanguageForm(editAccountService.listLanguages(accountId)));
        return gotoLanguagesJSP(model);
    }

    private String gotoLanguagesJSP(Model model) {
        model.addAttribute("languages1", "active");
        model.addAttribute("languages2", "aria-selected=\"true\"");
        model.addAttribute("types", getTypes());
        model.addAttribute("levels", getLevels());
        return "edit";
    }

    @RequestMapping(value = "/edit/languages", method = RequestMethod.POST)
    public String postLanguages(@Valid @ModelAttribute("languageForm") LanguageForm form, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("languages", form);
            return gotoLanguagesJSP(model);
        }

        //todo language update
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/hobbies", method = RequestMethod.GET)
    public String getEditHobbies(Model model) {
        model.addAttribute("hobbies", new HobbyForm(editAccountService.listHobbies(accountId)));
        return gotoHobbyJSP(model);
    }

    private String gotoHobbyJSP(Model model) {
        model.addAttribute("hobbies1", "active");
        model.addAttribute("hobbies2", "aria-selected=\"true\"");
        model.addAttribute("hobbyCategories", editAccountService.listHobbyCategory());
        return "edit";
    }

    @RequestMapping(value = "/edit/hobbies", method = RequestMethod.POST)
    public String postHobbies(@Valid @ModelAttribute("hobbyForm") HobbyForm form, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("hobbies", form);
            return gotoHobbyJSP(model);
        }

        //todo update hobby
        return "redirect:/profile";
    }

    @RequestMapping(value = "/edit/info", method = RequestMethod.GET)
    public String getEditInfo(Model model) {
        model.addAttribute("info", findAccountService.findBuId(accountId).getInfo());
        return gotoInfoJSP(model);
    }

    private String gotoInfoJSP(Model model) {
        model.addAttribute("info1", "active");
        model.addAttribute("info2", "aria-selected=\"true\"");
        return "edit";
    }

    @RequestMapping(value = "/edit/info", method = RequestMethod.POST)
    public String postInfo() { return "redirect:/profile"; }

    private List<String> getMouth() {
        return Arrays.asList("January","February","March","April","May","June","Jule","Avgust","September","October","November","December");
    }

    private List<String> getYears() {
        return Arrays.asList("2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010");
    }

    private List<String> getLevels() {
        return Arrays.asList("Beginner", "Elementary", "Pre-Intermediate", "Intermediate", "Upper-Intermediate", "Advanced", "Proficiency");
    }

    private List<String> getTypes() {
        return Arrays.asList("All", "Spoken", "Writing");
    }

}
