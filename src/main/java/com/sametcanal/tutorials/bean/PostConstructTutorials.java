package com.sametcanal.tutorials.bean;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

public class PostConstructTutorials {

    @Autowired
    Logger LOG;

   /* public PostConstructTutorials() {
        LOG.info("Log info çağrıldı");
    }*/

    @PostConstruct
    public void init(){
        LOG.info("Log info çağrıldı");
    }
}
