package POJO;

import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenString;

public class Image implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenString
    private String link;

    public Integer getId() {
        return id;
    }
}
