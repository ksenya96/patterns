package proxy;

import java.util.List;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib service;
    private String videoCache;
    private List<String> listCache;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {
        System.out.println("Proxy list Videos");
        if (listCache == null) {
            listCache = service.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        System.out.println("Proxy get video info");
        if (videoCache == null) {
            videoCache = service.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("Proxy download video");
        service.downloadVideo(id);
    }
}
