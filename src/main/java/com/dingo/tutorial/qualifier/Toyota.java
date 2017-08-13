package com.dingo.tutorial.qualifier;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Retention(RUNTIME)
@Target({FIELD, METHOD, TYPE, PARAMETER})
public @interface Toyota {
	AutoType value() default AutoType.Ford;
}