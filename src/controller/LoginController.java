package controller;

public class LoginController {

    public Boolean createUser(String usr, String pwd){
        if(usr.length()>0 && pwd.length() > 7) {
            return true;
        }else{
            return false;
        }

    }

    public Boolean login(String usr, String pwd){
       // 1. Kald på jeres Database klasse (lav selv en dummy),
        // og find ud af om brugeren hedder "ole".
        // Alle andre skal ikke komme ind.
        // returnér herefter svaret
        //2. Lav en unit test til login()
        return false;
    }

}
