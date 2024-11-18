package nahye.vcalendar.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // final로 선언된 필드의 생성자를 자동 생성
public class UserService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    //회원 데이터 생성
    public Users create(String username, String password){
        Users users = new Users();
        users.setUsername(username);

        //보안을 위해 비밀번호 암호화
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        users.setPassword(passwordEncoder.encode(password));
        users.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(users);
        return users;
    }
}
