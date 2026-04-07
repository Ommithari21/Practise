package restapi.example.practise;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public void add(  @Valid @RequestBody Users user){
        userService.addUser(user);
    }

    @GetMapping("/get")
    public List<Users>find(){
       return userService.GetAll();
    }


}
