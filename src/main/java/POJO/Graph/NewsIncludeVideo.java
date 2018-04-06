package POJO.Graph;

import Generator.Interfaces.GenNewsId;
import Generator.Interfaces.GenVideoId;

public class NewsIncludeVideo {
    @GenNewsId
    private Integer newsId;

    @GenVideoId
    private Integer videoId;
}
