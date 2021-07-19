package com.Spring.learnspringframework.SampleEnterpriseApp.Web;

import com.Spring.learnspringframework.SampleEnterpriseApp.Business.BusineesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @Autowired
    BusineesService busineesService;
    @GetMapping("/sum")
    public long displayMarks(){
        return busineesService.sendMarks();
    }
}
