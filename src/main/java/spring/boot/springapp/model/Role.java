package spring.boot.springapp.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Data
@Document(collection = "roles")
public class Role {
    @Id
    private ObjectId id;
    @Field(targetType = FieldType.STRING)
    @Indexed(unique = true)
    private RoleName role;

    public enum RoleName {
        ADMIN, USER
    }
}
