package com.wangzhen.statusbar.impl;

import android.os.Build;
import android.view.Window;

import com.wangzhen.statusbar.helper.FitHelper;
import com.wangzhen.statusbar.listener.RomAction;

/**
 * RomAction接口实现类
 * Created by wangzhen on 2018/4/10.
 */
public final class RomActionImpl implements RomAction {

    @Override
    public void fitFlyme(Window window, boolean isDark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            FitHelper.fitRaw(window, isDark);
        } else {
            FitHelper.fitFlyme(window, isDark);
        }
    }

    @Override
    public void fitMIUI(Window window, boolean isDark) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
            FitHelper.fitMIUI(window, isDark);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            FitHelper.fitRaw(window, isDark);
        } else {
            FitHelper.fitMIUI(window, isDark);
        }
    }

    @Override
    public void fitRaw(Window window, boolean isDark) {
        FitHelper.fitRaw(window, isDark);
    }
}
