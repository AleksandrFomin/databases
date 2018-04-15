package POJO.Graph;

import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class UserLikesNews implements DBObject {
    public UserLikesNews(Integer userId1, Integer newsId) {
        this.userId1 = userId1;
        this.newsId = newsId;
    }
    @GenForceExport
    private Integer userId1;

    @GenForceExport
    private Integer newsId;

    @Override
    public Integer getId() {
        return null;
    }
}
