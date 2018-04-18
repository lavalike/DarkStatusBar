package com.wangzhen.statusbar.listener;

import android.content.Context;

/**
 * 状态栏 暗/亮 操作
 * Created by wangzhen on 2018/4/10.
 */
public interface StatusBar {
    /**
     * 状态变文字图标变暗
     *
     * @param ctx 上下文
     */
    void fitDark(Context ctx);

    /**
     * 状态变文字图标变亮
     *
     * @param ctx 上下文
     */
    void fitLight(Context ctx);
}
