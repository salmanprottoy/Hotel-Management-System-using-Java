package services;
import repositories.*;

public class AdminLoginService{
    AdminRepository adminRepository=new AdminRepository();
    public boolean userValidation(String username,String password){
        return adminRepository.getUserValidity(username,password);
    }
}
