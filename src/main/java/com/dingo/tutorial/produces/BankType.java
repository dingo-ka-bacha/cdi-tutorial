package com.dingo.tutorial.produces;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;

@Retention(RUNTIME)
@Target({TYPE, METHOD, PARAMETER, FIELD})
public @interface BankType {
	@Nonbinding
	BankName value();
}
