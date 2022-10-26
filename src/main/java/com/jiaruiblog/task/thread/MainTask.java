package com.jiaruiblog.task.thread;

import com.jiaruiblog.enums.DocType;
import com.jiaruiblog.task.data.TaskData;
import com.jiaruiblog.task.exception.TaskRunException;
import com.jiaruiblog.task.executor.TaskExecutor;
import com.jiaruiblog.task.executor.TaskExecutorFactory;

import java.text.MessageFormat;

/**
 * @Author Jarrett Luo
 * @Date 2022/10/20 17:59
 * @Version 1.0
 */
public class MainTask implements RunnableTask{

    private TaskExecutor taskExecutor;

    public MainTask() {
        this.taskExecutor = TaskExecutorFactory.getTaskExecutor(DocType.getDocType("pdf"));

    }

    @Override
    public void success() {
        // TODO document why this method is empty
    }

    @Override
    public void failed() {
        // TODO document why this method is empty
    }

    @Override
    public void run() {

        if (null == taskExecutor) {
            throw new NullPointerException(MessageFormat.format("空指针异常,异常数据{}", "taskData"));
        }

        // 更新子任务数据

        TaskData taskData = new TaskData();

        try {
            // 调用执行器执行任务
            this.taskExecutor.execute(taskData);
        } catch (TaskRunException e) {
            throw new RuntimeException();
        }

    }
}
