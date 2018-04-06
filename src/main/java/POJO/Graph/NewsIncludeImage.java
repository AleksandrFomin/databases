package POJO.Graph;

import Generator.Interfaces.GenImageId;
import Generator.Interfaces.GenNewsId;

public class NewsIncludeImage {
    @GenNewsId
    private Integer newsId;

    @GenImageId
    private Integer imageId;
}
