package com.dingo.tutorial.named;

import javax.inject.Named;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Named("bmwAutoService")
public class BMWAutoService implements AutoService{
    public void getService() {
        log.debug("You chose BMW auto service");
    }
}
