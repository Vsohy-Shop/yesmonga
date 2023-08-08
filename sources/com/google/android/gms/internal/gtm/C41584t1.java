package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.C40394g;

/* renamed from: com.google.android.gms.internal.gtm.t1 */
public final class C41584t1 implements C40394g {

    /* renamed from: a */
    public int f104969a = 2;

    /* renamed from: b */
    public boolean f104970b;

    /* renamed from: a */
    public final void mo133377a(String str) {
    }

    /* renamed from: b */
    public final void mo133378b(Exception exc) {
    }

    /* renamed from: c */
    public final void mo133379c(String str) {
    }

    /* renamed from: d */
    public final int mo133380d() {
        return this.f104969a;
    }

    /* renamed from: e */
    public final void mo133381e(String str) {
    }

    /* renamed from: f */
    public final void mo133382f(String str) {
    }

    /* renamed from: g */
    public final void mo133383g(int i) {
        this.f104969a = i;
        if (!this.f104970b) {
            C41610u3<String> u3Var = C41634v3.f105118d;
            String b = u3Var.mo135909b();
            String b2 = u3Var.mo135909b();
            StringBuilder sb = new StringBuilder(b2.length() + 91);
            sb.append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append(b2);
            sb.append(" DEBUG");
            this.f104970b = true;
        }
    }
}
