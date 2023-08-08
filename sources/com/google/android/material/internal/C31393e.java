package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17586h0;
import androidx.core.view.C18026a4;
import androidx.core.view.C18184g6;
import com.google.android.material.color.C31266s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.e */
public class C31393e {

    /* renamed from: a */
    public static final int f75890a = 128;

    /* renamed from: a */
    public static void m126858a(@C0359n0 Window window, boolean z) {
        m126859b(window, z, (Integer) null, (Integer) null);
    }

    /* renamed from: b */
    public static void m126859b(@C0359n0 Window window, boolean z, @C0363p0 @C0354l Integer num, @C0363p0 @C0354l Integer num2) {
        boolean z2;
        boolean z3 = false;
        if (num == null || num.intValue() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num2 == null || num2.intValue() == 0) {
            z3 = true;
        }
        if (z2 || z3) {
            int b = C31266s.m125951b(window.getContext(), 16842801, -16777216);
            if (z2) {
                num = Integer.valueOf(b);
            }
            if (z3) {
                num2 = Integer.valueOf(b);
            }
        }
        C18026a4.m81880c(window, !z);
        int d = m126861d(window.getContext(), z);
        int c = m126860c(window.getContext(), z);
        window.setStatusBarColor(d);
        window.setNavigationBarColor(c);
        boolean e = m126862e(d, C31266s.m125960k(num.intValue()));
        boolean e2 = m126862e(c, C31266s.m125960k(num2.intValue()));
        C18184g6 a = C18026a4.m81878a(window, window.getDecorView());
        if (a != null) {
            a.mo52852i(e);
            a.mo52851h(e2);
        }
    }

    @TargetApi(21)
    /* renamed from: c */
    public static int m126860c(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C17586h0.m80563B(C31266s.m125951b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return C31266s.m125951b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    /* renamed from: d */
    public static int m126861d(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return C31266s.m125951b(context, 16843857, -16777216);
    }

    /* renamed from: e */
    public static boolean m126862e(int i, boolean z) {
        return C31266s.m125960k(i) || (i == 0 && z);
    }
}
