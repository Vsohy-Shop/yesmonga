package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.wi */
public class C41673wi {

    /* renamed from: b */
    public static volatile boolean f105217b = false;

    /* renamed from: c */
    public static volatile C41673wi f105218c;

    /* renamed from: d */
    public static volatile C41673wi f105219d;

    /* renamed from: e */
    public static final C41673wi f105220e = new C41673wi(true);

    /* renamed from: a */
    public final Map<C41649vi, C41361jj<?, ?>> f105221a;

    public C41673wi() {
        this.f105221a = new HashMap();
    }

    /* renamed from: a */
    public static C41673wi m168680a() {
        C41673wi wiVar = f105218c;
        if (wiVar == null) {
            synchronized (C41673wi.class) {
                wiVar = f105218c;
                if (wiVar == null) {
                    wiVar = f105220e;
                    f105218c = wiVar;
                }
            }
        }
        return wiVar;
    }

    /* renamed from: b */
    public static C41673wi m168681b() {
        C41673wi wiVar = f105219d;
        if (wiVar != null) {
            return wiVar;
        }
        synchronized (C41673wi.class) {
            C41673wi wiVar2 = f105219d;
            if (wiVar2 != null) {
                return wiVar2;
            }
            C41673wi b = C41217dj.m167405b(C41673wi.class);
            f105219d = b;
            return b;
        }
    }

    /* renamed from: c */
    public <ContainingType extends C41627uk> C41361jj<ContainingType, ?> mo135788c(ContainingType containingtype, int i) {
        return this.f105221a.get(new C41649vi(containingtype, i));
    }

    public C41673wi(boolean z) {
        this.f105221a = Collections.emptyMap();
    }
}
