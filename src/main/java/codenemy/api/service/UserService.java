package codenemy.api.service;

import codenemy.api.model.Role;
import codenemy.api.model.User;
import codenemy.api.repository.RoleRepo;
import codenemy.api.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserService implements IUserService{
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving user : {} to the database", user.getUsername());
        // Insert Custom Validation in here.
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving role : {} to the database", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        log.info("Adding role : {} to user : {}", user.getUsername(), role.getName());
        // Add custom implementation here
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("fetching user : {}", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("fetching all users");
        return userRepo.findAll();
    }
}
