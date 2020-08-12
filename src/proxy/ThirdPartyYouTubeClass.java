package proxy;

import java.util.Arrays;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    private List<String> videos = Arrays.asList("Котики", "Собачки", "Машины");

    @Override
    public List<String> listVideos() {
        System.out.println("Original list videos");
        return videos;
    }

    @Override
    public String getVideoInfo(int id) {
        System.out.println("Original get video info");
        if (id < 0 || id >= videos.size()) {
            return null;
        }
        return videos.get(id);
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("Original download video");
        if (id < 0 || id >= videos.size()) {
            System.out.println("Video does not exist");
        } else {
            System.out.println("Download " + videos.get(id));
        }
    }
}
