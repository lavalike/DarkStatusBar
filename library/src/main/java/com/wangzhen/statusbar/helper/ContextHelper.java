package com.wangzhen.statusbar.helper;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/**
 * Context帮助类
 * Created by wangzhen on 2018/4/18.
 */
public class ContextHelper {
    /**
     * 通过Context获取真正的Activity
     * 部分手机ROM对Context进行了包装，需要查找真正的Activity
     *
     * @param ctx context
     * @return activity
     */
    public static Activity getRealActivity(Context ctx) {
        while (ctx instanceof ContextWrapper) {
            if (ctx instanceof Activity) {
                return (Activity) ctx;
            }
            ctx = ((ContextWrapper) ctx).getBaseContext();
        }
        return null;
    }
}
