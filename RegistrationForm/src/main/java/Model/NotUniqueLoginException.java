package Model;

public class NotUniqueLoginException extends Exception{
    private final String NotUniqueLogin;

    public NotUniqueLoginException(String message,String notUniqueLogin) {
        super(message);
        this.NotUniqueLogin = notUniqueLogin;
    }

    public String getNotUniqueLogin(){
        return this.NotUniqueLogin;
    }
}
