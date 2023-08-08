package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ac */
public final class C41862ac extends C42281yb {
    /* renamed from: a */
    public final /* synthetic */ int mo136572a(Object obj) {
        return ((C42298zb) obj).mo137523a();
    }

    /* renamed from: b */
    public final /* synthetic */ int mo136573b(Object obj) {
        return ((C42298zb) obj).mo137524b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo136574c(Object obj) {
        C42177s9 s9Var = (C42177s9) obj;
        C42298zb zbVar = s9Var.zzc;
        if (zbVar != C42298zb.m171286c()) {
            return zbVar;
        }
        C42298zb f = C42298zb.m171288f();
        s9Var.zzc = f;
        return f;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo136575d(Object obj) {
        return ((C42177s9) obj).zzc;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo136576e(Object obj, Object obj2) {
        if (C42298zb.m171286c().equals(obj2)) {
            return obj;
        }
        if (C42298zb.m171286c().equals(obj)) {
            return C42298zb.m171287e((C42298zb) obj, (C42298zb) obj2);
        }
        ((C42298zb) obj).mo137525d((C42298zb) obj2);
        return obj;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo136577f(Object obj, int i, long j) {
        ((C42298zb) obj).mo137531j(i << 3, Long.valueOf(j));
    }

    /* renamed from: g */
    public final void mo136578g(Object obj) {
        ((C42177s9) obj).zzc.mo137528h();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo136579h(Object obj, Object obj2) {
        ((C42177s9) obj).zzc = (C42298zb) obj2;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo136580i(Object obj, C42112oc ocVar) throws IOException {
        ((C42298zb) obj).mo137532k(ocVar);
    }
}
