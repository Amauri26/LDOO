
package modelo;

public class Autentication {
    public static boolean authenticate(String username, String password){
        String userDataBase = "Amauri";
        String passwordDataBase= "12345";
        
        if(username.equals(userDataBase) && password.equals(passwordDataBase)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
