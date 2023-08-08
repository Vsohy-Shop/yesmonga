package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.core.content.C17344j;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.app.m */
public class C17165m {

    /* renamed from: a */
    public static final String f45399a = "android.support.AppLaunchChecker";

    /* renamed from: b */
    public static final String f45400b = "startedFromLauncher";

    /* renamed from: a */
    public static boolean m79405a(@C0359n0 Context context) {
        return context.getSharedPreferences(f45399a, 0).getBoolean(f45400b, false);
    }

    /* renamed from: b */
    public static void m79406b(@C0359n0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f45399a, 0);
        if (sharedPreferences.getBoolean(f45400b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C17344j.f45615e)) {
            sharedPreferences.edit().putBoolean(f45400b, true).apply();
        }
    }
}
