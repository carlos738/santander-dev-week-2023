package c.santander.dev.week3.service.exception;

public class NotFoundException extends BusinessException{
    private static final Long serialVersionUID = 1L;
    public NotFoundException(){
        super("Resource not found.");
    }
}
