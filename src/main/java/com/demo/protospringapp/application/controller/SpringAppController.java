package com.demo.protospringapp.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class SpringAppController {
    @GetMapping("/version")
    public ResponseEntity<?> version() {
        return new ResponseEntity<>("in-soft-0.0.1ls",HttpStatus.OK);
    }
    @GetMapping("/version/cloud-pc")
    public ResponseEntity<?> versionCloudPc() {
        return new ResponseEntity<>("in-soft-cloud-pc",HttpStatus.OK);
    }
}
