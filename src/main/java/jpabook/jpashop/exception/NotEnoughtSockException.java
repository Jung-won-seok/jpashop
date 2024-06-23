package jpabook.jpashop.exception;

public class NotEnoughtSockException extends RuntimeException {
    public NotEnoughtSockException() {
        super();
    }

    public NotEnoughtSockException(String message) {
        super(message);
    }

    public NotEnoughtSockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughtSockException(Throwable cause) {
        super(cause);
    }

}
