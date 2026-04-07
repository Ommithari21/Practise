package restapi.example.practise.Aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessAopExample {

    @Autowired
    private Dataservice dataservice1;

    public int  calculateMax(){
     int[] result= dataservice1.retrivedata();
    // throw new RuntimeException("Error is accured");
    return Arrays.stream(result).max().orElseThrow(()->new RuntimeException("The Incorrect code"));
    }
}
