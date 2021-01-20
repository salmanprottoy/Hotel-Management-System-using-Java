public class AdminLoginService{
    AdminRepository AdminRepository=new AdminRepository();
    public boolean userValidation(String username,String password){
        return AdminRepository.getUserValidity(username,password);
    }
}
