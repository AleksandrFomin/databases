package POJO.Graph;

import Generator.Interfaces.GenCommentId;
import Generator.Interfaces.GenNewsId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class NewsHasComment implements DBObject {
    public NewsHasComment(Integer newsId, Integer commentId) {
        this.newsId = newsId;
        this.commentId = commentId;
    }
    @GenForceExport
    private Integer newsId;
    @GenForceExport
    private Integer commentId;

    @Override
    public Integer getId() {
        return null;
    }
}
