package POJO.Column;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenImageId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.annotation.time.GenTimestamp;

import java.util.Date;

public class GroupAddImage implements DBObject {
    @GenGroupId
    private Integer groupId;

    @GenImageId
    private Integer imageId;

    @GenTimestamp
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Integer getImageId() {
        return imageId;
    }
}