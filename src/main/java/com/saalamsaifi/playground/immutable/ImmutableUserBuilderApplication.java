package com.saalamsaifi.playground.immutable;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.util.Set;

public class ImmutableUserBuilderApplication {
  public Set<ConstraintViolation<User.UserBuilder>> validate(User.UserBuilder userBuilder) {
    var validator = Validation.buildDefaultValidatorFactory().getValidator();
    return validator.validate(userBuilder);
  }
}
