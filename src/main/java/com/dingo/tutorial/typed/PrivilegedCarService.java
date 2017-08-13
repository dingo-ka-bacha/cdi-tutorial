package com.dingo.tutorial.typed;

import javax.enterprise.inject.Typed;

@Typed(PrivilegedCarService.class)
public class PrivilegedCarService extends CarService {

}
