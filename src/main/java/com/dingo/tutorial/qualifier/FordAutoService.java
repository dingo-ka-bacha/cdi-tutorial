package com.dingo.tutorial.qualifier;

import static com.dingo.tutorial.qualifier.AutoType.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Ford
@Auto(Ford) //second approach by using enums
public class FordAutoService implements AutoService{ 
    public void getService() {
        log.debug("You chose Ford auto service");
    }
}