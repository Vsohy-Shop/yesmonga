package com.urbanairship.google;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;

/* renamed from: com.urbanairship.google.c */
public class C9111c {

    /* renamed from: a */
    public static final String f24623a = "com.google.market";

    /* renamed from: b */
    public static final String f24624b = "com.android.vending";

    /* renamed from: c */
    public static final int f24625c = 0;

    /* renamed from: d */
    public static final int f24626d = -1;

    /* renamed from: e */
    public static Boolean f24627e;

    /* renamed from: f */
    public static Boolean f24628f;

    /* renamed from: g */
    public static Boolean f24629g;

    /* renamed from: h */
    public static Boolean f24630h;

    /* renamed from: a */
    public static void m34012a(@C0359n0 Context context) {
        if (m34016e()) {
            try {
                int a = C9108a.m34008a(context);
                if (a != 0) {
                    if (C9108a.m34009b(a)) {
                        C36059m.m148406b("Launching Play Services Activity to resolve error.", new Object[0]);
                        try {
                            context.startActivity(new Intent(context, PlayServicesErrorActivity.class));
                        } catch (ActivityNotFoundException e) {
                            C36059m.m148410f(e);
                        }
                    } else {
                        C36059m.m148413i("Error %s is not user recoverable.", Integer.valueOf(a));
                    }
                }
            } catch (IllegalStateException e2) {
                C36059m.m148411g(e2, "Google Play services developer error.", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static boolean m34013b() {
        if (f24628f == null) {
            if (!m34016e()) {
                f24628f = Boolean.FALSE;
            } else {
                try {
                    f24628f = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f24628f = Boolean.FALSE;
                }
            }
        }
        return f24628f.booleanValue();
    }

    /* renamed from: c */
    public static boolean m34014c() {
        if (f24630h == null) {
            if (!m34016e()) {
                f24630h = Boolean.FALSE;
            } else {
                try {
                    f24630h = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f24630h = Boolean.FALSE;
                }
            }
        }
        return f24630h.booleanValue();
    }

    /* renamed from: d */
    public static int m34015d(@C0359n0 Context context) {
        if (m34016e()) {
            return C9108a.m34008a(context);
        }
        return -1;
    }

    /* renamed from: e */
    public static boolean m34016e() {
        if (f24627e == null) {
            try {
                Class.forName("com.google.android.gms.common.i");
                f24627e = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f24627e = Boolean.FALSE;
            }
        }
        return f24627e.booleanValue();
    }

    /* renamed from: f */
    public static boolean m34017f(@C0359n0 Context context) {
        boolean z;
        if (f24629g == null) {
            if (m34018g(context, "com.android.vending") || m34018g(context, f24623a)) {
                z = true;
            } else {
                z = false;
            }
            f24629g = Boolean.valueOf(z);
        }
        return f24629g.booleanValue();
    }

    /* renamed from: g */
    public static boolean m34018g(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
