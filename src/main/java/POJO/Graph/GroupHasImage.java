package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenImageId;
import POJO.Document.DBObject;

public class GroupHasImage implements DBObject {
    @GenGroupId
    private Integer groupId;

    @GenImageId
    private Integer imageId;

    @Override
    public Integer getId() {
        return null;
    }
}
