package facade;

import facade.convert.BitrateReader;
import facade.convert.CodecFactory;
import facade.convert.CompressionCodec;
import facade.convert.MPEG4CompressionCodec;
import facade.convert.OggCompressionCodec;
import facade.convert.VideoFile;

import java.io.File;

public class VideoConverter {
    public File convert(String fileName, String format) {
        VideoFile file = new VideoFile(fileName);
        CompressionCodec sourceCodec = CodecFactory.extract(file);
        CompressionCodec destinationCodec;
        if ("mp4".equals(format)) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        byte[] buffer = BitrateReader.read(fileName, sourceCodec);
        String result = BitrateReader.convert(buffer, destinationCodec);
        return new File(result);
    }
}
