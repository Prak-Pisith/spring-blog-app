package pisith.xyz.blogapp.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/api/v1")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<Users>> getList() {
        return ResponseEntity.ok().body(userService.getList());
    }
}
