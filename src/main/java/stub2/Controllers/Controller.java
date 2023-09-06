package stub2.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;
import stub2.Models.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/user")
public class Controller {
    @GetMapping
    public ResponseEntity<?> getUser() {

        return ResponseEntity.ok(new User("Oleg", "12345"));
    }
    @PostMapping
    public ResponseEntity<?> postUser(@RequestBody User user) {
        user.setDate(LocalDate.now().toString());
        return ResponseEntity.ok(user);

    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(HttpMessageNotReadableException exception) {
        return ResponseEntity
                .status(HttpStatus.valueOf(500))
                .body(LocalDateTime.now().toString() + "    My Exception");
    }
}
