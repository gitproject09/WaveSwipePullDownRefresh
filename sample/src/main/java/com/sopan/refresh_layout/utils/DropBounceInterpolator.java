package com.sopan.refresh_layout.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * @author Sopan
 *
 */
public class DropBounceInterpolator implements Interpolator {

    public DropBounceInterpolator() {
    }

    @SuppressWarnings({"UnusedDeclaration"})
    public DropBounceInterpolator(Context context, AttributeSet attrs) {
    }

    @Override
    public float getInterpolation(float v) {
        //y = -19 * (x - 0.125)^2 + 1.3     (0 <= x < 0.25)
        //y = -6.5 * (x - 0.625)^2 + 1.1    (0.5 <= x < 0.75)
        //y = 0                             (0.25 <= x < 0.5 && 0.75 <= x <=1)

        if (v < 0.25f) {
            return -38.4f * (float) Math.pow(v - 0.125, 2) + 0.6f;
        } else if (v >= 0.5 && v < 0.75) {
            return -19.2f * (float) Math.pow(v - 0.625, 2) + 0.3f;
        } else {
            return 0;
        }
    }
}
