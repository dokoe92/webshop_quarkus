package at.dokoe.quarkus.Exceptions;


public class RestError {

    private String message;
    private int httperror;

    public RestError(String message, int httperror) {
        this.message = message;
        this.httperror = httperror;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHttperror() {
        return httperror;
    }

    public void setHttperror(int httperror) {
        this.httperror = httperror;
    }
}