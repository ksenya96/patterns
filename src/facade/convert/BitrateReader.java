package facade.convert;

public class BitrateReader {
    public static byte[] read(String fileName, CompressionCodec compressionCodec) {
        System.out.println("Read file " + fileName);
        return new byte[0];
    }

    public static String convert(byte[] buffer, CompressionCodec destinationCodec) {
        System.out.println("Convert file");
        return "hello";
    }
}
