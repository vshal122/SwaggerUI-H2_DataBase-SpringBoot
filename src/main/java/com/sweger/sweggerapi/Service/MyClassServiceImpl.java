package com.sweger.sweggerapi.Service;

import com.sweger.sweggerapi.DAO.IRespository;
import com.sweger.sweggerapi.Model.MyClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyClassServiceImpl implements  IMyClassService{

    @Autowired
    IRespository iRespository;

    @Override
    public MyClass savedata(MyClass myClass) {
        return  iRespository.save(myClass);
    }

    @Override
    public MyClass getData(Long id) {
        return  iRespository.findOne(id);
    }
}
