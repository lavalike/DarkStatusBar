package com.wangzhen.statusbar.listener;

import android.view.Window;

/**
 * 状态栏适配接口
 * Created by wangzhen on 2018/4/10.
 */
public interface RomAction {

    /**
     * 适配Flyme状态栏
     *
     * @param window 当前Activity的Window
     * @param isDark 状态栏文字图标是否变暗
     */
    void fitFlyme(Window window, boolean isDark);

    /**
     * 适配MIUI状态栏
     *
     * @param window 当前Activity的Window
     * @param isDark 状态栏文字图标是否变暗
     */
    void fitMIUI(Window window, boolean isDark);

    /**
     * 适配原生状态栏
     *
     * @param window 当前Activity的Window
     * @param isDark 状态栏文字图标是否变暗
     */
    void fitRaw(Window window, boolean isDark);
}
