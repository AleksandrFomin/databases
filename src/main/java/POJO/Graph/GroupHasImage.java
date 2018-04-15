package POJO.Graph;

import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class GroupHasImage implements DBObject {

    public GroupHasImage(Integer groupId, Integer imageId) {
        this.groupId = groupId;
        this.imageId = imageId;
    }
    @GenForceExport
    private Integer groupId;
    @GenForceExport
    private Integer imageId;

    @Override
    public Integer getId() {
        return null;
    }
}
