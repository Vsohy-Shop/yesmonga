package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import androidx.work.C21377l;

/* renamed from: androidx.work.impl.utils.s */
public class C21341s {

    /* renamed from: a */
    public static final String f55048a = C21377l.m98584i("PackageManagerHelper");

    /* renamed from: a */
    public static boolean m98458a(@C0359n0 Context context, @C0359n0 Class<?> cls) {
        return m98459b(context, cls.getName());
    }

    /* renamed from: b */
    public static boolean m98459b(@C0359n0 Context context, @C0359n0 String str) {
        if (context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m98460c(@C0359n0 Context context, @C0359n0 Class<?> cls, boolean z) {
        int i;
        String str;
        String str2 = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            C21377l e = C21377l.m98582e();
            String str3 = f55048a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            sb.append(str);
            e.mo63774a(str3, sb.toString());
        } catch (Exception e2) {
            C21377l e3 = C21377l.m98582e();
            String str4 = f55048a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (!z) {
                str2 = "disabled";
            }
            sb2.append(str2);
            e3.mo63775b(str4, sb2.toString(), e2);
        }
    }
}
