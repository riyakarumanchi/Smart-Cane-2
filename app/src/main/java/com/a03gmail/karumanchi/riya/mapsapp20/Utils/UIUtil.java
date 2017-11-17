package com.a03gmail.karumanchi.riya.mapsapp20.Utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by David Kirkley on 2017-11-09.
 */

public class UIUtil {
    public static void showMessage(Context context, String message) {
        showMessage(context, message, Toast.LENGTH_SHORT);
    }

    public static void showMessage(Context context, int resId) {
        showMessage(context, context.getString(resId), Toast.LENGTH_SHORT);
    }

    public static void showMessage(Context context, String message, int length) {
        Toast.makeText(context, message, length).show();
    }

    public static void showMessage(Context context, int resId, int length) {
        Toast.makeText(context, context.getString(resId), length).show();
    }
}
