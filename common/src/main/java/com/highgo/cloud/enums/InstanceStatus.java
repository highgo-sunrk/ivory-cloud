package com.highgo.cloud.enums;

public enum InstanceStatus {

    /**
     * 实例创建中
     */
    CREATING
    /**
     * 实例创建失败
     */
    , CREATE_FAILED
    /**
     * 实例运行中
     */
    , RUNNING
    /**
     * 重启中
     */
    , RESTARTING
    /**
     * 修改密码中
     */
    , PASSWORD_CHANGING
    /**
     * 修改密码失败
     */
    , PASSWORD_CHANGE_FAILED
    /**
     * 删除中
     */
    , DELETING
    /**
     * 已删除
     */
    ,DELETED
    /**
     * 删除失败
     */
    , DELETE_FAILED
    /**
     * 恢复失败
     */
    , RESTORE_FAILED
    /**
     * 恢复中
     */
    , RESTORING
    /**
     * 更配/升级规格中
     */
    , UPGRADING
    /**
     * 更配/升级规格失败
     */
    , UPGRADE_FLAVOR_FAILED
    /**
     * 扩容中
     */
    , EXTENDING
    /**
     * 扩容失败
     */
    , EXTEND_STORAGE_FAILED
    /**
     * 重启失败
     */
    , RESTART_FAILED
    /**
     * 更新配置中
     */
    , CONFIG_CHANGING
    /**
     * 更新配置失败
     */
    , CONFIG_CHANGE_FAILED
    /**
     * 实例异常
     */
    , ERROR
    /**
     * 外网开启中
     */
    ,NODEPORT_OPENING
    /**
     * 外网关闭中
     */
    ,NODEPORT_CLOSING
    /**
     * 开启外网失败
     */
    ,NODEPORT_OPEN_FAILED
    /**
     * 关闭外网失败
     */
    ,NODEPORT_CLOSE_FAILED
    /**
     * 清空数据失败
     */
    ,PURGE_FAILED
    /**
     * 清空数据中
     */
    ,PURGING
    /**
     * 备份中
     */
    ,BACKUPING
    /**
     * 自动弹性伸缩中
     */
    ,AUTO_SCALING
    /**
     * 服务已关闭
     */
    ,STOPPED
    /**
     * pdr开关
     */
    ,PDR_SWITCHING

}
