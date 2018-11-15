package com.csg.exchange.client.controller;

import com.csg.exchange.client.service.receiver.Receiver;
//import com.csg.exchange.client.service.webserviceClient.AlertInfo;
import com.csg.exchange.client.dao.AlertInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/exchange")
public class BaseController {
    @RequestMapping("getData")
    public AlertInfo getBase(@RequestBody AlertInfo alertInfo) {
        Receiver receiver = new Receiver();
        receiver.receive(alertInfo);

        return alertInfo;
    }
}
