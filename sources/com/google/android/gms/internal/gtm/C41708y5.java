package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.C0363p0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.gtm.y5 */
public final class C41708y5 implements C41228e6 {

    /* renamed from: c */
    public static C41708y5 f105292c;

    /* renamed from: d */
    public static final Object f105293d = new Object();

    /* renamed from: e */
    public static final Set<String> f105294e = new HashSet(Arrays.asList(new String[]{"GET", "HEAD", "POST", "PUT"}));

    /* renamed from: a */
    public final C41301h7 f105295a;

    /* renamed from: b */
    public final C41276g6 f105296b;

    public C41708y5(Context context) {
        C41276g6 b = C41276g6.m167531b(context);
        C41301h7 h7Var = new C41301h7();
        this.f105296b = b;
        this.f105295a = h7Var;
    }

    /* renamed from: b */
    public static C41228e6 m168850b(Context context) {
        C41708y5 y5Var;
        synchronized (f105293d) {
            if (f105292c == null) {
                f105292c = new C41708y5(context);
            }
            y5Var = f105292c;
        }
        return y5Var;
    }

    /* renamed from: a */
    public final boolean mo135337a(String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 Map<String, String> map, @C0363p0 String str4) {
        if (str2 != null && !f105294e.contains(str2)) {
            C41493p6.m168153e(String.format("Unsupport http method %s. Drop the hit.", new Object[]{str2}));
            return false;
        } else if (C41661w6.m168646a().mo136018d() || this.f105295a.mo135432a()) {
            this.f105296b.mo135404f(str, str2, str3, map, str4);
            return true;
        } else {
            C41493p6.m168153e("Too many hits sent too quickly (rate throttled).");
            return false;
        }
    }
}
