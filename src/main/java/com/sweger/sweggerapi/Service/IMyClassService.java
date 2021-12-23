package com.sweger.sweggerapi.Service;

import com.sweger.sweggerapi.Model.MyClass;
import org.springframework.stereotype.Component;

@Component
public interface IMyClassService {

    public MyClass savedata(MyClass myClass);

    public  MyClass getData(Long id);
}
