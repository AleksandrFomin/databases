package POJO;

import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenPhrase;
import io.dummymaker.annotation.string.GenString;

public class News implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenPhrase
    private String text;

    public Integer getId() {
        return id;
    }
}
