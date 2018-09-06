package com.sopan.refresh_layout.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * @author Sopan
 */
public class DisplayUtil {

    private DisplayUtil(){}

    public static boolean isOver600dp(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.widthPixels / displayMetrics.density >= 600;
    }
}
