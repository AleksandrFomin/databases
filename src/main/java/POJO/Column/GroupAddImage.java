package POJO.Column;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenImageId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class GroupAddImage implements DBObject {
    @GenGroupId
    private Integer groupId;

    @GenImageId
    private Integer imageId;

    @GenDate
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }
}