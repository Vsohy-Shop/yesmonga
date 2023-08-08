package com.google.android.gms.internal.gtm;

import com.google.firebase.C33262n;

/* renamed from: com.google.android.gms.internal.gtm.r4 */
public final class C41539r4 extends C41511q0 implements C41512q1<C41587t4> {

    /* renamed from: b */
    public final C41587t4 f104920b = new C41587t4();

    public C41539r4(C41607u0 u0Var) {
        super(u0Var);
    }

    /* renamed from: a */
    public final void mo135764a(String str, String str2) {
        if (C33262n.f80888k.equals(str)) {
            this.f104920b.f104972a = str2;
        } else if ("ga_sampleFrequency".equals(str)) {
            try {
                this.f104920b.f104973b = Double.parseDouble(str2);
            } catch (NumberFormatException e) {
                mo135731B("Error parsing ga_sampleFrequency value", str2, e);
            }
        } else {
            mo135763z("string configuration name not recognized", str);
        }
    }

    /* renamed from: b */
    public final void mo135765b(String str, boolean z) {
        if ("ga_autoActivityTracking".equals(str)) {
            this.f104920b.f104975d = z;
        } else if ("ga_anonymizeIp".equals(str)) {
            this.f104920b.f104976e = z;
        } else if ("ga_reportUncaughtExceptions".equals(str)) {
            this.f104920b.f104977f = z ? 1 : 0;
        } else {
            mo135763z("bool configuration name not recognized", str);
        }
    }

    /* renamed from: c */
    public final void mo135766c(String str, int i) {
        if ("ga_sessionTimeout".equals(str)) {
            this.f104920b.f104974c = i;
        } else {
            mo135763z("int configuration name not recognized", str);
        }
    }

    /* renamed from: f */
    public final void mo135767f(String str, String str2) {
        this.f104920b.f104978g.put(str, str2);
    }

    public final /* bridge */ /* synthetic */ C41488p1 zza() {
        return this.f104920b;
    }
}
