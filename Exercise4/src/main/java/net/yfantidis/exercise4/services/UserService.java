package net.yfantidis.exercise4.services;

import net.yfantidis.exercise4.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(int id){
        if(id==1){
            return new User(1,"Jim");
        }
        else if (id==2){
            return new User(2,"Bob");
        }

        return null;

    }
}
