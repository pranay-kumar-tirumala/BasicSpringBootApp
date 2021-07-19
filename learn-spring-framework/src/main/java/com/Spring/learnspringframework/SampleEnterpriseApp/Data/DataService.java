package com.Spring.learnspringframework.SampleEnterpriseApp.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService{
    public List<Integer> sendIndivMarks(){
        return Arrays.asList(91,92,93,94,95,96);
    }
}