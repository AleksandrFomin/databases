package POJO.Graph;

import Generator.Interfaces.GenCommentId;
import Generator.Interfaces.GenNewsId;
import POJO.Document.DBObject;

public class NewsHasComment implements DBObject {
    @GenNewsId
    private Integer newsId;

    @GenCommentId
    private Integer commentId;

    @Override
    public Integer getId() {
        return null;
    }
}
