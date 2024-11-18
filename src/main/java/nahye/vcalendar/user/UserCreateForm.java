//회원가입을 위한 폼 클래스

package nahye.vcalendar.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserCreateForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "USER ID를 입력해주세요.")
    private String username;

    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String password1;

    @NotEmpty(message = "비밀번호 확인은 필수사항입니다.")
    private String password2;
}
