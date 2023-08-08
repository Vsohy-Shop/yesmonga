package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.util.l */
public final class C40986l {
    @C0363p0

    /* renamed from: a */
    public static Boolean f104230a;
    @C0363p0

    /* renamed from: b */
    public static Boolean f104231b;
    @C0363p0

    /* renamed from: c */
    public static Boolean f104232c;
    @C0363p0

    /* renamed from: d */
    public static Boolean f104233d;
    @C0363p0

    /* renamed from: e */
    public static Boolean f104234e;
    @C0363p0

    /* renamed from: f */
    public static Boolean f104235f;
    @C0363p0

    /* renamed from: g */
    public static Boolean f104236g;
    @C0363p0

    /* renamed from: h */
    public static Boolean f104237h;
    @C0363p0

    /* renamed from: i */
    public static Boolean f104238i;
    @C0363p0

    /* renamed from: j */
    public static Boolean f104239j;
    @C0363p0

    /* renamed from: k */
    public static Boolean f104240k;
    @C0363p0

    /* renamed from: l */
    public static Boolean f104241l;

    @C40473a
    /* renamed from: a */
    public static boolean m166640a(@C0359n0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f104238i == null) {
            boolean z = false;
            if (C40996v.m166689n() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f104238i = Boolean.valueOf(z);
        }
        return f104238i.booleanValue();
    }

    @C40473a
    /* renamed from: b */
    public static boolean m166641b(@C0359n0 Context context) {
        if (f104241l == null) {
            boolean z = false;
            if (C40996v.m166692q() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            f104241l = Boolean.valueOf(z);
        }
        return f104241l.booleanValue();
    }

    @C40473a
    /* renamed from: c */
    public static boolean m166642c(@C0359n0 Context context) {
        if (f104235f == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f104235f = Boolean.valueOf(z);
        }
        return f104235f.booleanValue();
    }

    @C40473a
    /* renamed from: d */
    public static boolean m166643d(@C0359n0 Context context) {
        if (f104230a == null) {
            boolean z = false;
            if (!m166646g(context) && !m166650k(context) && !m166653n(context)) {
                if (f104237h == null) {
                    f104237h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if (!f104237h.booleanValue() && !m166640a(context) && !m166648i(context)) {
                    if (f104240k == null) {
                        f104240k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if (!f104240k.booleanValue() && !m166641b(context)) {
                        z = true;
                    }
                }
            }
            f104230a = Boolean.valueOf(z);
        }
        return f104230a.booleanValue();
    }

    @C40473a
    /* renamed from: e */
    public static boolean m166644e(@C0359n0 Context context) {
        return m166654o(context.getResources());
    }

    @C40473a
    @TargetApi(21)
    /* renamed from: f */
    public static boolean m166645f(@C0359n0 Context context) {
        return m166652m(context);
    }

    @C40473a
    /* renamed from: g */
    public static boolean m166646g(@C0359n0 Context context) {
        return m166647h(context.getResources());
    }

    @C40473a
    /* renamed from: h */
    public static boolean m166647h(@C0359n0 Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (f104231b == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || m166654o(resources)) {
                z = true;
            }
            f104231b = Boolean.valueOf(z);
        }
        return f104231b.booleanValue();
    }

    @C40473a
    /* renamed from: i */
    public static boolean m166648i(@C0359n0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f104239j == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            f104239j = Boolean.valueOf(z);
        }
        return f104239j.booleanValue();
    }

    @C40473a
    /* renamed from: j */
    public static boolean m166649j() {
        int i = C40864j.f103985a;
        return C38212b.f96784D.equals(Build.TYPE);
    }

    @C40473a
    @TargetApi(20)
    /* renamed from: k */
    public static boolean m166650k(@C0359n0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f104233d == null) {
            boolean z = false;
            if (C40996v.m166684i() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f104233d = Boolean.valueOf(z);
        }
        return f104233d.booleanValue();
    }

    @C40473a
    @TargetApi(26)
    /* renamed from: l */
    public static boolean m166651l(@C0359n0 Context context) {
        if (m166650k(context) && !C40996v.m166688m()) {
            return true;
        }
        if (!m166652m(context)) {
            return false;
        }
        if (!C40996v.m166689n() || C40996v.m166692q()) {
            return true;
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: m */
    public static boolean m166652m(@C0359n0 Context context) {
        if (f104234e == null) {
            boolean z = false;
            if (C40996v.m166685j() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f104234e = Boolean.valueOf(z);
        }
        return f104234e.booleanValue();
    }

    /* renamed from: n */
    public static boolean m166653n(@C0359n0 Context context) {
        if (f104236g == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f104236g = Boolean.valueOf(z);
        }
        return f104236g.booleanValue();
    }

    /* renamed from: o */
    public static boolean m166654o(@C0359n0 Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (f104232c == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            f104232c = Boolean.valueOf(z);
        }
        return f104232c.booleanValue();
    }
}
