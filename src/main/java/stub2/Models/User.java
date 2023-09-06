package stub2.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String login;
    private String passwd;
    private String date;

    public User(String login, String passwd) {
        this.login = login;
        this.passwd = passwd;
        this.date = LocalDate.now().toString();
    }
}
