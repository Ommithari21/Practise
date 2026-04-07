package restapi.example.practise.Aop;

import org.springframework.stereotype.Component;

@Component
public class Dataservice {

    public int[] retrivedata(){
        return  new int[] {10,20,30,40};
    }

}
