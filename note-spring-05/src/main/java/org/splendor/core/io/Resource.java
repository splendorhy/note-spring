package org.splendor.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author splendor.s
 * @create 2022/11/6 下午3:58
 * @description
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
