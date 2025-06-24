package cn.coudou.domain.task.service;

import cn.coudou.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * 消息任务服务接口
 */
public interface ITaskService {

    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}

