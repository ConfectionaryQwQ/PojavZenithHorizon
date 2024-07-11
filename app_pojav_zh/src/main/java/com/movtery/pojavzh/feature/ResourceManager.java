package com.movtery.pojavzh.feature;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

public class ResourceManager {
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    private static Resources resources;

    public static synchronized void setResources(Context context) {
        ResourceManager.context = context;
        if (resources == null) {
            resources = context.getResources();
        }
    }

    public static Context getContext() {
        return context;
    }

    public static Resources getResources() {
        return resources;
    }

    public static String getString(int resId) {
        return resources.getString(resId);
    }
}