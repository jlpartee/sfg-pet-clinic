package com.jlpartee.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 2018-12-30.
 */
@Controller
public class VetController {
    @RequestMapping({"/vets","/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
