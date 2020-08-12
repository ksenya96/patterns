package proxy;

public class Main {
    public static void main(String[] args) {
        ThirdPartyYouTubeLib lib = new CachedYouTubeClass(new ThirdPartyYouTubeClass());
        System.out.println(lib.listVideos());
        System.out.println(lib.getVideoInfo(2));
        lib.downloadVideo(1);

        System.out.println(lib.listVideos());
        System.out.println(lib.getVideoInfo(2));
        lib.downloadVideo(1);
    }
}
