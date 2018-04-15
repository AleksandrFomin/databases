package POJO.Graph;

import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class UserLikesImage implements DBObject {
    public UserLikesImage(Integer userId1, Integer imageId) {
        this.userId1 = userId1;
        this.imageId = imageId;
    }
    @GenForceExport
    private Integer userId1;
    @GenForceExport
    private Integer imageId;

    @Override
    public Integer getId() {
        return null;
    }
}
