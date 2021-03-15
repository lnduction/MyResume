package resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import resume.entity.Account;
import resume.repository.storage.AccountRepository;
import resume.service.FindAccountService;
import resume.service.NameService;

@Controller
public class PublicDataController {

    @Autowired private NameService nameService;
    @Autowired private FindAccountService findAccountService;

    @RequestMapping(value="/{uid}", method= RequestMethod.GET)
    public String getProfile(@PathVariable("uid") String uid, Model model){

        model.addAttribute("account", findAccountService.findByUid(uid));
        return "profile";
    }

    @RequestMapping(value="/error", method=RequestMethod.GET)
    public String getError(){
        return "error";
    }

    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public String getWelcome(){
        return "error";
    }

    @RequestMapping(value="/search", method=RequestMethod.GET)
    public String getSearch(){
        return "error";
    }

    @RequestMapping(value="/sing-in", method=RequestMethod.GET)
    public String getLogin(){
        return "enter";
    }

    @RequestMapping(value="/sing-in-failed", method=RequestMethod.GET)
    public String getLoginFailed(){
        return "enter";
    }

    @RequestMapping(value="/sing-up", method=RequestMethod.GET)
    public String getRegister(){
        return "register";
    }

    @RequestMapping(value="/sing-up", method=RequestMethod.POST)
    public String postRegister(){ return "register-success";  }

    @RequestMapping(value="/sing-up/success", method=RequestMethod.GET)
    public String getRegisterSuccess(){
        return "register-success";
    }

    @RequestMapping(value="/restore", method=RequestMethod.GET)
    public String getRecovery(){
        return "recovery";
    }

    @RequestMapping(value="/restore", method=RequestMethod.POST)
    public String postRestore(){ return "recovery-success";}

    @RequestMapping(value="/restore/success", method=RequestMethod.GET)
    public String getRecoverySuccess(){
        return "recovery-success";
    }

    @RequestMapping(value="/restore/{uid}", method=RequestMethod.GET)
    public String getRecovery(@PathVariable("uid") String uid){
        return "recovery-success";
    }
}
