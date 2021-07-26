package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import web.model.Role;
import web.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    //List<User> findById(Integer id);

    //User getUserByUsername(String username);





//    User getUser(int id);
//
//    void add(User user);
//
//    void delete(int id);
//
//    void update(User user, int id);
//
//    User findUserByUsername(String username);
//
//    User addRoles(User user, Role role);



}
