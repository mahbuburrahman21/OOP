package ExceptionHandling;

public class BookNotFoundException extends Exception{
    public boolean isFound;
    public BookNotFoundException(boolean isFound){
        this.isFound = isFound;
    }

    public String getMessage(){
        return "The book is not found in the inventory";
    }

    public boolean getIsFound(){
        return isFound;
    }
}