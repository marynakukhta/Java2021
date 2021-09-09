package Controller;

import Model.Model;
import View.View;
import Model.NotUniqueLoginException;
import Model.NoteBook;

import java.util.Scanner;

import static View.TextConstants.NOT_UNIQUE_LOGIN;

public class Controller {
    private View view;
    private Model model;


    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.addToNoteBook();

        NoteBook noteBook = getNoteBook(inputNoteNoteBook);
        System.out.println(noteBook);
    }

    private NoteBook getNoteBook(InputNoteNoteBook inputNoteNoteBook) {
        NoteBook noteBook = null;
        while(true) {
            try {
                noteBook = new NoteBook(inputNoteNoteBook.getFirstName(),
                        inputNoteNoteBook.getLoginData());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println(View.resourceBundle.getString(NOT_UNIQUE_LOGIN));
                inputNoteNoteBook.inputLogin();
            }
        }
        return noteBook;
    }

}
