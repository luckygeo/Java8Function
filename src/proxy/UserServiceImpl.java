package proxy;

public class UserServiceImpl implements UserService {
    @Override
    public String getName(String a) {
        System.out.println(a);
        System.out.println("getName");
        return "Jelly";
    }
}
