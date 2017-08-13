package com.dingo.tutorial.named;

import javax.inject.Named;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Named("fordAutoService")
public class FordAutoService implements AutoService{ 
    public void getService() {
        log.debug("You chose Ford auto service");
    }
}