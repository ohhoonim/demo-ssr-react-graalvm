package dev.ohhoonim.demo_thymeleaf_react.record;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class RecordFunctionTest {
    
    @Test
    void recordFucntion() {
        Function<String, List<Attribute>> attributes = (username) -> List.of(
            new Attribute("matthew", "rank", "assistant"),
            new Attribute("matthew", "position", "leader"),
            new Attribute("ohhoonim", "position", "leader"),
            new Attribute("matthew", "position", "leader")
        ).stream().filter(a -> username.equals(a.username())).toList(); 

        var user = new User("matthew", attributes);
        assertThat(user.getAttributes()).hasSize(3);
    }
}

record User (
    String username,
    Function<String, List<Attribute>> attributes
) {
    public List<Attribute> getAttributes() {
        return attributes == null ? List.of() : 
                attributes.apply(username);
    }
}

record Attribute (
    String username, String name, String value
) {}