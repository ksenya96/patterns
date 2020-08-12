package facade.convert;

public class CodecFactory {
    public static CompressionCodec extract(VideoFile file) {
        System.out.println("Extract file codec " + file);
        return new MPEG4CompressionCodec();
    }
}
