package Model;

public class NotUniqueLoginException extends Throwable{
    private final String notUniqueLogin;

    public NotUniqueLoginException(String message,String notUniqueLogin) {
        super(message);
        this.notUniqueLogin = notUniqueLogin;
    }

    public String getNotUniqueLogin(){
        return this.notUniqueLogin;
    }
}
