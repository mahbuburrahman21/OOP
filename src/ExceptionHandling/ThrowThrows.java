package ExceptionHandling;

import java.util.Scanner;

public class ThrowThrows {

    public static void main(String[] args) {
        ThrowThrows tt = new ThrowThrows();

        try {
            tt.teachClass();
        } catch (BookNotFoundException e){

            System.out.println("Exception occur");

        }
    }


    public void teachClass() throws BookNotFoundException{
        boolean bookFound = locateBook();
        if (!bookFound){
            throw new BookNotFoundException(bookFound);
        }
        else {
            readBook();
            explainContent();
        }
    }


    public boolean locateBook(){
        return false;
    }
    public void readBook(){
        System.out.println("Reading the book.");
    }
    public void explainContent(){
        System.out.println("Explaining the content of the book.");
    }

}
