package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.C16564b;
import androidx.core.p027os.C17842w0;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22925d;
import com.google.common.util.concurrent.C32487a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

/* renamed from: androidx.core.content.s0 */
public final class C17486s0 {
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: a */
    public static final String f45789a = "PackageManagerCompat";
    @SuppressLint({"ActionValue"})

    /* renamed from: b */
    public static final String f45790b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @C0376v0(30)
    /* renamed from: androidx.core.content.s0$a */
    public static class C17487a {
        /* renamed from: a */
        public static boolean m80259a(@C0359n0 Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.s0$b */
    public @interface C17488b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public static boolean m80256a(@C0359n0 PackageManager packageManager) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            z = true;
        } else {
            z = false;
        }
        if (i < 30) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m80257b(packageManager) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            return true;
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public static String m80257b(@C0359n0 PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(f45790b).setData(Uri.fromParts(C22925d.f58520a, "com.example", (String) null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @C0359n0
    /* renamed from: c */
    public static C32487a<Integer> m80258c(@C0359n0 Context context) {
        C16564b t0 = C16564b.m75001t0();
        if (!C17842w0.m81309a(context)) {
            t0.mo48106j0(0);
            return t0;
        } else if (!m80256a(context.getPackageManager())) {
            t0.mo48106j0(1);
            return t0;
        } else {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i < 30) {
                t0.mo48106j0(0);
                return t0;
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 4;
            if (i2 >= 31) {
                if (C17487a.m80259a(context)) {
                    if (i >= 31) {
                        i3 = 5;
                    }
                    t0.mo48106j0(Integer.valueOf(i3));
                } else {
                    t0.mo48106j0(2);
                }
                return t0;
            } else if (i2 == 30) {
                if (!C17487a.m80259a(context)) {
                    i3 = 2;
                }
                t0.mo48106j0(Integer.valueOf(i3));
                return t0;
            } else {
                C17504y0 y0Var = new C17504y0(context);
                t0.mo5489q(new C17447q0(y0Var), Executors.newSingleThreadExecutor());
                y0Var.mo51919a(t0);
                return t0;
            }
        }
    }
}
