package resume.validator;

import resume.annotation.constraints.FieldMatch;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldMatchConstraintsValidator implements ConstraintValidator<FieldMatch, String> {

    private String first;
    private String second;

    @Override
    public void initialize(FieldMatch fieldMatch) {
        this.first = fieldMatch.first();
        this.second = fieldMatch.second();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return first.equals(second);
    }
}
