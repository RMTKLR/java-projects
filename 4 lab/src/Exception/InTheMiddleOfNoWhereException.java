package Exception;

public class InTheMiddleOfNoWhereException extends RuntimeException{
    public InTheMiddleOfNoWhereException(String name) {
        super("Staying nowhere, " + name + " couldn't stand still.");
    }
}
