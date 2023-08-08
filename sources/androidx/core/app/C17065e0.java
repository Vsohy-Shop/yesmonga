package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.app.e0 */
public final class C17065e0 {

    /* renamed from: a */
    public static final String f45023a = "NavUtils";

    /* renamed from: b */
    public static final String f45024b = "android.support.PARENT_ACTIVITY";

    @C0376v0(16)
    /* renamed from: androidx.core.app.e0$a */
    public static class C17066a {
        @C0373u
        /* renamed from: a */
        public static Intent m78910a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m78911b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @C0373u
        /* renamed from: c */
        public static boolean m78912c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static Intent m78902a(@C0359n0 Activity activity) {
        Intent a = C17066a.m78910a(activity);
        if (a != null) {
            return a;
        }
        String d = m78905d(activity);
        if (d == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d);
        try {
            if (m78906e(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(d);
            sb.append("' in manifest");
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static Intent m78903b(@C0359n0 Context context, @C0359n0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e = m78906e(context, componentName);
        if (e == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e);
        if (m78906e(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    @C0363p0
    /* renamed from: c */
    public static Intent m78904c(@C0359n0 Context context, @C0359n0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String e = m78906e(context, new ComponentName(context, cls));
        if (e == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e);
        if (m78906e(context, componentName) == null) {
            return Intent.makeMainActivity(componentName);
        }
        return new Intent().setComponent(componentName);
    }

    @C0363p0
    /* renamed from: d */
    public static String m78905d(@C0359n0 Activity activity) {
        try {
            return m78906e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @C0363p0
    /* renamed from: e */
    public static String m78906e(@C0359n0 Context context, @C0359n0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f45024b)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: f */
    public static void m78907f(@C0359n0 Activity activity) {
        Intent a = m78902a(activity);
        if (a != null) {
            m78908g(activity, a);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    /* renamed from: g */
    public static void m78908g(@C0359n0 Activity activity, @C0359n0 Intent intent) {
        C17066a.m78911b(activity, intent);
    }

    /* renamed from: h */
    public static boolean m78909h(@C0359n0 Activity activity, @C0359n0 Intent intent) {
        return C17066a.m78912c(activity, intent);
    }
}
