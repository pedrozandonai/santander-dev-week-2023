package pedro.zandonai.service.impl;

import org.springframework.stereotype.Service;
import pedro.zandonai.domain.model.User;
import pedro.zandonai.domain.repository.UserRepository;
import pedro.zandonai.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number already exists!");
        }
        return userRepository.save(userToCreate);
    }
}
