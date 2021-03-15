package resume.validator;

import resume.annotation.constraints.FirstFiledLessThanSecond;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FirstFiledLessThanSecondConstraintsValidator implements ConstraintValidator<FirstFiledLessThanSecond, String> {

    private String first;
    private String second;

    @Override
    public void initialize(FirstFiledLessThanSecond firstFiledLessThanSecond) {
        this.first = firstFiledLessThanSecond.first();
        this.second = firstFiledLessThanSecond.second();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return first != null && second != null && first.compareTo(second) < 0;
    }
}
