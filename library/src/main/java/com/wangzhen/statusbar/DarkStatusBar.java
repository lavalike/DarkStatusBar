package com.wangzhen.statusbar;

import android.app.Activity;
import android.os.Build;
import android.view.Window;

import com.wangzhen.statusbar.helper.OSHelper;
import com.wangzhen.statusbar.impl.RomActionImpl;
import com.wangzhen.statusbar.listener.RomAction;
import com.wangzhen.statusbar.listener.StatusBar;

/**
 * 暗色状态栏
 * Created by wangzhen on 2018/4/10.
 */
public class DarkStatusBar implements StatusBar {

    private final RomAction action;

    static class SingletonHolder {
        static StatusBar INSTANCE = new DarkStatusBar();
    }

    private DarkStatusBar() {
        action = new RomActionImpl();
    }

    public static StatusBar get() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 当前Activity状态栏修改为暗色
     *
     * @param activity 当前Activity
     */
    @Override
    public void fitDark(Activity activity) {
        fit(activity, true);
    }

    /**
     * 当前Activity状态栏修改为亮色
     *
     * @param activity 当前Activity
     */
    @Override
    public void fitLight(Activity activity) {
        fit(activity, false);
    }

    private void fit(Activity activity, boolean isDark) {
        if (isLegal(activity)) {
            Window window = activity.getWindow();
            if (OSHelper.isFlyme()) {
                action.fitFlyme(window, isDark);
            } else if (OSHelper.isMIUI()) {
                action.fitMIUI(window, isDark);
            } else {
                action.fitRaw(window, isDark);
            }
        }
    }

    /**
     * 校验Activity状态
     *
     * @param activity 当前Activity
     * @return 校验结果
     */
    private boolean isLegal(Activity activity) {
        if (activity == null)
            return false;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            if (activity.isDestroyed())
                return false;
        }
        return true;
    }
}
