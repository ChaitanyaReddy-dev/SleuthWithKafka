package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    public static Logger LOGGER= LoggerFactory.getLogger(DemoController.class);

    @Autowired
    ExternalServiceConnection externalServiceConnection;

    @GetMapping("/getdemo")
    public String stub(){

        LOGGER.info("inside stub method of demo app");
        String msg=externalServiceConnection.order();
        LOGGER.info(msg);
        return "order created";
    }
}
