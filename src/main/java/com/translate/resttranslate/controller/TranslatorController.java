package com.translate.resttranslate.controller;

import com.translate.resttranslate.InputMsg;
import com.translate.resttranslate.OutPutMsg;
import com.translate.resttranslate.service.TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TranslatorController {

    @Autowired
    TranslatorService transService;

    @GetMapping("/test")
    public String getI18Text() {

        return "test";

    }

    @PostMapping("/msg")
    public OutPutMsg convertI18Text(@RequestBody InputMsg msg) {

        return transService.getMessage(msg);

    }

    @GetMapping(path = "")
    public ResponseEntity<List<String>> getMenu() {
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.valueOf("application/json;charset=UTF-8"));
        List<String> msg = (List<String>) transService.getMsg();
        return new ResponseEntity<>(msg,httpHeaders, HttpStatus.OK);
    }
}
