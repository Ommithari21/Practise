package restapi.example.practise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostService {

    List<Posts>post=new ArrayList<>();

    public void add(Posts posts){
        post.add(posts);

    }

    public void delete_By_id(int id){
        post.remove(id);
    }

    public void get_All(){
        post.forEach(System.out::println);
    }

    public void get_By_id(int id){
        post.get(id);

    }




}
