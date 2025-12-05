package CustomExceptionAndThrowThrows;

public class NegativeRadiusException extends Exception {
    //NegativeRadiusException(){} //no parameter constructor
    NegativeRadiusException(String message){
        super(message); // the constructor element are written in the super class already.
        //so as we extended the Exception class, we can just call the super class constructor
    }

    @Override
    public String getMessage(){
        return "Invalid radius Entered...";
    }

    public NegativeRadiusException(Throwable cause){
        super(cause);
    }

    public NegativeRadiusException(String message, Throwable cause){
        super(message,cause);
    }
}
