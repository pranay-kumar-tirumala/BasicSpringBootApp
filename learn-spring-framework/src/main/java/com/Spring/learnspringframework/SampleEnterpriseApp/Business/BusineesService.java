package com.Spring.learnspringframework.SampleEnterpriseApp.Business;

import com.Spring.learnspringframework.SampleEnterpriseApp.Data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusineesService{
    @Autowired
    private DataService dataService;
    public long sendMarks(){
        List<Integer> list=dataService.sendIndivMarks();
        return list.stream().reduce(Integer::sum).get();
    }
}
