package com.xapps.nexos.controller;

import com.mongodb.MongoClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class IndexController {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @RequestMapping("/")
    public String index(Model model) {
        MongoClient mongoClient = new MongoClient("mongodb");
        logger.log(Level.INFO, "First database name: " + mongoClient.listDatabaseNames().first());
        return "index";
    }
}