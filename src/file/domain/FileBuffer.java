package file.domain;

import file.driver.DiskDriver;
import org.junit.Test;

import java.io.IOException;

/**
 * @ClassName FileBuffer
 * @Description 文件缓存区
 * @Date 2019/11/11
 **/
public class FileBuffer {
    public static FAT fat = new FAT();
    public static Directory root;

    static {
        root = new Directory("root", FileType.ROOT, false, true, true, true);
        root.setNumber(DiskDriver.ROOT_LOCATION);
        root.setLength(Byte.toUnsignedInt(new DiskDriver().read(DiskDriver.DISK_TOTAL).getContent()[0]));
    }
}
