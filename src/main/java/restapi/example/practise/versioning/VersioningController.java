package restapi.example.practise.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

    @GetMapping("/v1/data")
    public Data ReturnData(){
        return new Data(new Name("om","hello"));
    }

    @GetMapping("/v2/data")
    public Name ReturnName(){
        return new Name("om","hello");

    }

}

