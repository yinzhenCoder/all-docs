package com.jiaruiblog.task.executor;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author Jarrett Luo
 * @Date 2022/10/24 11:42
 * @Version 1.0
 */
public class DocxExecutor extends TaskExecutor{

    @Override
    protected String downloadFile() {
        return super.downloadFile();
    }

    @Override
    protected void readText(InputStream is, String textFilePath) throws IOException {
        // TODO document why this method is empty
    }

    @Override
    protected void makeThumb(InputStream is, String picPath) throws IOException {
        // TODO document why this method is empty
    }
}
