package spring.boot.springapp.model;

import java.time.LocalDate;
import java.util.Set;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Data
@Document(collection = "users")
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true)
    private Long userId;
    private String name;
    @Field(name = "birth_date", targetType = FieldType.STRING)
    private LocalDate dateOfBirth;
    @Field(name = "phone_number")
    @Indexed(unique = true)
    private int phoneNumber;
    private String password;
    @DBRef
    private Set<Role> roles;
}
