package restapi.example.practise;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class Users {
    @NotNull
   private Long id;
    @Size(max=10)
  private   String name;
    @Past
   private LocalDateTime Birthdate;


    public Users(Long id,String name,LocalDateTime Birthdate)
    {
        this.id=id;
        this.name=name;
        this.Birthdate=Birthdate;
    }

    public Long getId()
    {
        return id;

    }

    public void setId(Long id)
    {
        this.id=id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        Birthdate = birthdate;
    }
}
