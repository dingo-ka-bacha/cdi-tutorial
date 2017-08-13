package com.dingo.tutorial.qualifier;

import static com.dingo.tutorial.qualifier.AutoType.Toyota;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Toyota
@Auto(Toyota) //second approach by using enums
public class ToyotaAutoService implements AutoService{
    public void getService() {
        log.debug("You chose Toyota auto service");
    }
}
