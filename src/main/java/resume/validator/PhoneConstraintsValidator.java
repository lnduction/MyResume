package resume.validator;

import resume.annotation.constraints.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintsValidator implements ConstraintValidator<Phone, String> {


    @Override
    public void initialize(Phone phone) { }

    private static final String NUMBERS = "0123456789";

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null) return false;
        if(s.charAt(0) != '+') return false;
        for(int i = 1; i < s.length(); i++) if (NUMBERS.indexOf(s.charAt(i)) == -1) return false;
        return true;
    }
}
