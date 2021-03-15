package resume.validator;

import resume.annotation.constraints.Adulthood;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AdulthoodConstraintsValidator implements ConstraintValidator<Adulthood, Date> {

    private int adulthoodAge;

    @Override
    public void initialize(Adulthood adulthood) {
       this.adulthoodAge = adulthood.adulthoodAge();
    }

    @Override
    public boolean isValid(Date s, ConstraintValidatorContext constraintValidatorContext) {
        try {
            LocalDate birthdate = s.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate now = LocalDate.now();
            Period period = Period.between(birthdate, now);
            return period.getYears() >= adulthoodAge;
        } catch (Exception e) { return false; }
    }
}
