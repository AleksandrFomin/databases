package POJO;

import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenCity;
import io.dummymaker.annotation.string.GenName;
import io.dummymaker.annotation.time.GenTime;

import java.util.Date;

public class Profile implements DBObject {

    @GenEnumerate(from = 1)
    private Integer id;

    @GenName
    private String lastName;

    @GenName
    private String name;

    @GenName
    private String secondName;

    @GenTime(to = 1514764800L)
    private Date birthDate;

    @GenCity
    private String city;

    public Integer getId() {
        return id;
    }
}
