package restapi.example.practise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CustomException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String,Object>>cal(Exception ex){
        HashMap<String,Object>map=new HashMap<>();
        map.put("TimeStamp", LocalDateTime.now());
        map.put("Error",ex.getMessage());
        map.put("Status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>>find(MethodArgumentNotValidException ex){
        HashMap<String,String>map=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(errors->
                map.put(errors.getField(),errors.getDefaultMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
}


}
