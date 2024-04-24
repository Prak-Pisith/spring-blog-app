package pisith.xyz.blogapp.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<Users> getList();
}
