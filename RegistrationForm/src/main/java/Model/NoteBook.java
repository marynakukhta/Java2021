package Model;

import View.View;

import static View.TextConstants.NOT_UNIQUE_LOGIN;

public class NoteBook {
    private String firstName;
    private String loginData;

    public NoteBook(String firstName, String login) throws NotUniqueLoginException{
        if (DB.isLoginUnique(login)){
            throw new NotUniqueLoginException(View.resourceBundle.getString(NOT_UNIQUE_LOGIN),
                    login);
        }
        this.firstName = firstName;
        this.loginData = login;
    }

    @Override
    public String toString() {
        return "NoteBook:" +
                "firstName='" + firstName + '\'' +
                ", loginData='" + loginData;
    }

}