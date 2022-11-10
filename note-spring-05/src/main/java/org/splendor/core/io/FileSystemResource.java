package org.splendor.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:59
 * @description
 */
public class FileSystemResource implements Resource {

    private final File file;

    private final String path;

    public FileSystemResource(File file, String path){
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResource(String path){
        this.file = new File(path);
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public final String getPath(){
        return this.path;
    }

}
