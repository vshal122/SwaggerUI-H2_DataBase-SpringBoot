package com.sweger.sweggerapi.Controller;

import com.sweger.sweggerapi.Model.MyClass;
import com.sweger.sweggerapi.Service.IMyClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements IMyController{

    @Autowired
    IMyClassService iMyClassService;

    @Override
    public MyClass dataSave(MyClass myClass) {

            return iMyClassService.savedata(myClass);

    }

    @Override
    public MyClass dataGet(Long id) {
        return iMyClassService.getData(id);
    }
}
