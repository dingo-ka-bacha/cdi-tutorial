package com.dingo.tutorial.qualifier;

import static com.dingo.tutorial.qualifier.AutoType.Honda;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Honda
@Auto(Honda) //second approach by using enums
public class HondaAutoService implements AutoService{
    public void getService() {
        log.debug("You chose Honda auto service");
    }
}
