package spring.boot.springapp.crud;

import java.time.LocalDate;
import java.util.Set;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import spring.boot.springapp.model.Role;
import spring.boot.springapp.model.User;
import spring.boot.springapp.service.UserService;

@AutoConfigureDataMongo
@TestPropertySource(locations = "classpath:test.properties")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(SpringExtension.class)
public class UserCrudTest {
    private static final Role USER = new Role();
    private static final Role ADMIN = new Role();
    private final UserService userService;

    @Autowired
    public UserCrudTest(UserService userService) {
        this.userService = userService;
    }

    @BeforeAll
    public static void start(@Autowired MongoTemplate mongoTemplate) {
        mongoTemplate.getDb().drop();
        USER.setRole(Role.RoleName.USER);
        USER.setId(ObjectId.get());
        ADMIN.setRole(Role.RoleName.ADMIN);
        ADMIN.setId(ObjectId.get());
    }

    @Test
    public void saveUser_Ok() {
        User user1 = new User();
        user1.setName("TestUser1");
        user1.setPassword("Password");
        user1.setDateOfBirth(LocalDate.now());
        user1.setPhoneNumber(123);
        user1.setRoles(Set.of(USER));
        User result = userService.save(user1);
        Assertions.assertNotNull(result.getId());
        Assertions.assertEquals(user1, result);
    }
}
