package com.translate.resttranslate.service;

import com.translate.resttranslate.InputMsg;
import com.translate.resttranslate.OutPutMsg;
import com.translate.resttranslate.component.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TranslatorService {

    @Autowired
    Translator transLator;

   public OutPutMsg getMessage(InputMsg msg)
    {
        OutPutMsg outPutMsg=new OutPutMsg();

        outPutMsg.setName(transLator.toLocale(msg.getName()));

        return outPutMsg;
    }

    /**
     * Send menu list
     *
     * @return menu
     */
    public List<String> getMsg() {
        List<String> msg = new ArrayList<>();
        msg.add(0, transLator.toLocale("s1"));
        msg.add(1, transLator.toLocale("s2"));
        msg.add(2, transLator.toLocale("s3"));
        msg.add(3, transLator.toLocale("s4"));
        return msg;
    }
}
