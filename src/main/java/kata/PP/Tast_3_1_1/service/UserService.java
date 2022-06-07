package kata.PP.Tast_3_1_1.service;


import kata.PP.Tast_3_1_1.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User save(User user);
    User getById(long id);
    void removeById(long id);


}
