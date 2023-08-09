package study.jpaReadWrite.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.jpaReadWrite.entity.User;
import study.jpaReadWrite.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<User> getListRead() {
        return userRepository.findAll();
    }

    @Transactional
    public List<User> getListWrite() {
        return userRepository.findAll();
    }

}
