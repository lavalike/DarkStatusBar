package com.wangzhen.statusbar.listener;

import android.app.Activity;

/**
 * 状态栏 暗/亮 操作
 * Created by wangzhen on 2018/4/10.
 */
public interface StatusBar {
    /**
     * 状态变文字图标变暗
     *
     * @param activity 当前Activity
     */
    void fitDark(Activity activity);

    /**
     * 状态变文字图标变亮
     *
     * @param activity 当前Activity
     */
    void fitLight(Activity activity);
}
