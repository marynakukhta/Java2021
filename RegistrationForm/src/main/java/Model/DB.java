package Model;

public enum DB {
    FIRST_NOTE("Anna","anna1111");

    private final String firstName;
    private final String login;

    DB(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean isLoginUnique(String loginData){
        for(DB note: DB.values()){
            if(note.getLogin().equals(loginData)){
                return true;}
        }
        return false;
    }
}
