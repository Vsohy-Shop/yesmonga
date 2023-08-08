package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40781l;
import com.google.android.gms.common.internal.C40792n0;
import com.google.android.gms.common.util.C40974d0;

/* renamed from: com.google.android.gms.common.i */
public final class C40717i extends C40864j {
    @C0359n0

    /* renamed from: k */
    public static final String f103701k = "GooglePlayServicesErrorDialog";
    @Deprecated

    /* renamed from: l */
    public static final int f103702l = C40864j.f103985a;
    @C0359n0
    @Deprecated

    /* renamed from: m */
    public static final String f103703m = "com.google.android.gms";
    @C0359n0

    /* renamed from: n */
    public static final String f103704n = "com.android.vending";

    @Deprecated
    /* renamed from: A */
    public static void m165687A(int i, @C0359n0 Context context) {
        C40713g x = C40713g.m165640x();
        if (C40864j.m166241o(context, i) || C40864j.m166242p(context, i)) {
            x.mo134201J(context);
        } else {
            x.mo134194C(context, i);
        }
    }

    @C0359n0
    @Deprecated
    /* renamed from: f */
    public static PendingIntent m165688f(int i, @C0359n0 Context context, int i2) {
        return C40864j.m166232f(i, context, i2);
    }

    @C0359n0
    @Deprecated
    @C40974d0
    /* renamed from: g */
    public static String m165689g(int i) {
        return C40864j.m166233g(i);
    }

    @C0359n0
    /* renamed from: i */
    public static Context m165690i(@C0359n0 Context context) {
        return C40864j.m166235i(context);
    }

    @C0359n0
    /* renamed from: j */
    public static Resources m165691j(@C0359n0 Context context) {
        return C40864j.m166236j(context);
    }

    @C40781l
    @Deprecated
    /* renamed from: l */
    public static int m165692l(@C0359n0 Context context) {
        return C40864j.m166238l(context);
    }

    @C40473a
    @Deprecated
    /* renamed from: m */
    public static int m165693m(@C0359n0 Context context, int i) {
        return C40864j.m166239m(context, i);
    }

    @Deprecated
    /* renamed from: s */
    public static boolean m165694s(int i) {
        return C40864j.m166245s(i);
    }

    @C0363p0
    @Deprecated
    /* renamed from: v */
    public static Dialog m165695v(int i, @C0359n0 Activity activity, int i2) {
        return m165696w(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @C0363p0
    @Deprecated
    /* renamed from: w */
    public static Dialog m165696w(int i, @C0359n0 Activity activity, int i2, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == C40864j.m166241o(activity, i)) {
            i = 18;
        }
        return C40713g.m165640x().mo134214t(activity, i, i2, onCancelListener);
    }

    @Deprecated
    /* renamed from: x */
    public static boolean m165697x(int i, @C0359n0 Activity activity, int i2) {
        return m165698y(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    /* renamed from: y */
    public static boolean m165698y(int i, @C0359n0 Activity activity, int i2, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        return m165699z(i, activity, (Fragment) null, i2, onCancelListener);
    }

    /* renamed from: z */
    public static boolean m165699z(int i, @C0359n0 Activity activity, @C0363p0 Fragment fragment, int i2, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == C40864j.m166241o(activity, i)) {
            i = 18;
        }
        C40713g x = C40713g.m165640x();
        if (fragment == null) {
            return x.mo134193B(activity, i, i2, onCancelListener);
        }
        Dialog E = x.mo134196E(activity, i, C40792n0.m165973c(fragment, C40713g.m165640x().mo134205e(activity, i, "d"), i2), onCancelListener);
        if (E == null) {
            return false;
        }
        x.mo134199H(activity, E, f103701k, onCancelListener);
        return true;
    }
}
