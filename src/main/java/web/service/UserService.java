package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public User findUserByUsername(String username) {
//        return userRepository.getUserByUsername(username);
//    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
