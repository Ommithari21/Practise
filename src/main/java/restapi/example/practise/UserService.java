package restapi.example.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    List<Users>user=new ArrayList<>();

//    @Autowired
//    private Users users;


    public void addUser(Users users){
        user.add(users);
    }

    public void deleteUser(Long id){
        user.remove(id);
    }

    //find all
    public List<Users> GetAll(){
        return user;
    }

//need to use java 8+
//    public void get_ById(int id){
//        user.get(id);
//    }


}
