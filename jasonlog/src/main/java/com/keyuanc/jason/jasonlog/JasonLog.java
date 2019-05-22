package com.keyuanc.jason.jasonlog;

import android.util.Log;

public class JasonLog {
    private static final String TAG = "jason";
    private static boolean debug = true;

    public static void log(Class clazz, String log) {
        if (debug) {
            Log.d(TAG, clazz.toString() + "-->" + log);
        }
    }
}
