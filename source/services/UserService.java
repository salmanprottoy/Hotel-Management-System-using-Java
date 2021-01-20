package services;
import repositories.*;
public class UserService{
    UsersRepository userRepository=new UsersRepository();
    public boolean addNewUser(String username,String password){
        return userRepository.insertUserIntoDB(username,password);
    }
}
