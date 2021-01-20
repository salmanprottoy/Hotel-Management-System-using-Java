public class UsersLoginService{
    UsersRepository UsersRepository=new UsersRepository();
    public boolean userValidation(String username,String password){
        return UsersRepository.getUserValidity(username,password);
    }
}
