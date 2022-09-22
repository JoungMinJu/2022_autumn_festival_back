package likelion.festival.exception;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ExceptionCode {
    WRONG_BOOTH_ID(HttpStatus.BAD_REQUEST.value(), "해당 ID의 Booth가 없습니다."),
    WRONG_COMMENT_ID(HttpStatus.BAD_REQUEST.value(), "해당 ID의 Comment가 없습니다."),
    WRONG_PASSWORD(HttpStatus.BAD_REQUEST.value(), "비밀번호가 일치하지 않습니다.");

    private final int code;
    private final String message;

    ExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;

    }
}