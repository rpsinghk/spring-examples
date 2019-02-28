package com.jsf.simple.bean;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class JsfBean {

    private String welcomeMessage = "Populated by JSF created bean";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

}