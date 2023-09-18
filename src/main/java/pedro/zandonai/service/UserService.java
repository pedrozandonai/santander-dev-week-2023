package pedro.zandonai.service;

import pedro.zandonai.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
