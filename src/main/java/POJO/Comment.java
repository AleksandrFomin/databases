package POJO;

import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenPhrase;

public class Comment implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenPhrase
    private String message;

    public Integer getId() {
        return id;
    }
}
