package proxy;

import java.util.List;

public interface ThirdPartyYouTubeLib {
    List<String> listVideos();
    String getVideoInfo(int id);
    void downloadVideo(int id);
}
