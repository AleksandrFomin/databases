package POJO.Document;

import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenNick;
import io.dummymaker.annotation.string.GenPhrase;
import io.dummymaker.annotation.string.GenTag;

public class Group implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenNick
    private String name;

    @GenPhrase
    private String description;

    @GenTag
    private String subjects;

    public Integer getId() {
        return id;
    }
}
